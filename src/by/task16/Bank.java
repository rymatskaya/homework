package by.task16;

import by.task16.exception.AccountNotFoundException;
import by.task16.exception.NotEnoughMoneyException;

import java.util.Set;

/**
 * 2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
 * 5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой.
 * Сигнатура метода будет такая:
 * public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)
 * 5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда
 * переводят деньги, выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
 * 5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой
 * то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
 * 5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте
 * (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,
 * на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.
 */

public class Bank {
    private Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Account searchAccountByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNum().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("Откройте счёт в нашем банке для выполнения переводов ", "not.found.account");
    }

    public Boolean checkSumma(Account account, Double amount) {
        if (account.getSumma() - amount >= 0)
            return true;
        throw new NotEnoughMoneyException("Недостаточно средств для перевода", "not.enough.money");
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account accountFrom = searchAccountByAccountNumber(accountNumberFrom);
        Account accountTo = searchAccountByAccountNumber(accountNumberTo);
        if (checkSumma(accountFrom, amount)) {
            accountFrom.setSumma(accountFrom.getSumma() - amount);
            accountTo.setSumma(accountTo.getSumma() + amount);
        }
        System.out.println("Баланс счета списания: " + accountFrom.getSumma());
        System.out.println("Баланс счета зачисления: " + accountTo.getSumma());
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        Account accountFrom = searchAccountByAccountNumber(accountNumberFrom);
        Account accountTo = searchAccountByAccountNumber(accountNumberTo);
        Double summa;

        if (accountFrom.getCurrency().equals("BYN")) {
            summa = amount / exchangeRate;
        } else {
            summa = amount * exchangeRate;
        }

        if (checkSumma(accountFrom, amount) ) {
            accountFrom.setSumma(accountFrom.getSumma() - amount);
            accountTo.setSumma(accountTo.getSumma() + summa);
        }
        System.out.println("Баланс счета списания: " + accountFrom.getSumma());
        System.out.println("Баланс счета зачисления: " + accountTo.getSumma());
    }

}
