package by.task16;

import java.util.HashSet;
import java.util.Set;

/**
 6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
 7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт.
 При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
 7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в
 нашем банке для выполнения переводов»
 7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств
 для перевода»
 7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
 8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо,что вопользовались услугами банка»
 9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать
 со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
 public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount,
 double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём.
 Проверки выполните те же что и в пункте 5.*/
public class Main {
    static void main() {
        Account account1 = new Account(1, "accountNum1", "BYN", 5416.55) ;
        Account account2 = new Account(2, "accountNum2", "BYN", 541.55) ;
        Account account3 = new Account(3, "accountNum3", "BYN", 516.55) ;
        Account account4 = new Account(4, "accountNum4", "BYN", 416.55) ;
        Account account5 = new Account(5, "accountNum5", "USD", 54.55) ;

        Set<Account> accounts = new HashSet<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        Bank bank = new Bank(accounts);
        bank.transferMoney("accountNum1", "accountNum2", 50.00);
        //bank.transferMoney("accountNum3", "accountNum4", 600.00);
        //bank.transferMoney("accountNum7", "accountNum4", 600.00);

        bank.transferMoney("accountNum4", "accountNum5", 50.00, 2);
        bank.transferMoney("accountNum5", "accountNum4", 50.00, 2);

    }
}
