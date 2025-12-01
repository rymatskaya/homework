package by.task15;

import java.util.*;

/**
 * 1.1.Создать класс. Сотрудник.
 * 1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
 * 1.3.Создать сотрудников (создайте штук восемь)
 * 1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа.,
 * а в качестве значения им присвоить им профессию.
 * 1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии.
 * Сигнатура метода к примеру такая.
 * private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
 * Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).
 * 1.6*. Необходимо написать метод, который будет из мапки описанной в п.2.4 создаст мапку
 * типа HashMap<String, Collection<Сотрудник>>. Т.е, поменять местами Квалифакацию и сотрудника
 * ( в качестве ключа будет выступать квалификация, в качестве значения-коллекция сотрудников).
 */
public class Main {
    static void main() {
        Map<Employee, String> persons = new HashMap<>();

        Employee employee1 = new Employee(1, "Иван", "Иванов", 25, 2000.00);
        Employee employee2 = new Employee(2, "Антон", "Антонов", 52, 1000.00);
        Employee employee3 = new Employee(3, "Артем", "Артемов", 40, 30000.00);
        Employee employee4 = new Employee(4, "Алексей", "Алексеев", 35, 2500.00);
        Employee employee5 = new Employee(5, "Петр", "Петров", 54, 3100.00);
        Employee employee6 = new Employee(6, "Павел", "Павлов", 37, 3200.00);
        Employee employee7 = new Employee(7, "Ольга", "Иванова", 45, 3400.00);
        Employee employee8 = new Employee(8, "Елена", "Ленина", 47, 4000.00);

        persons.put(employee1, "Программист");
        persons.put(employee2, "Дизайнер");
        persons.put(employee3, "Директор");
        persons.put(employee4, "Доктор");
        persons.put(employee5, "Плотник");
        persons.put(employee6, "Плотник");
        persons.put(employee7, "Бухгалтер");
        persons.put(employee8, "Медсестра");

        Set<Employee> employees = persons.keySet();
        Collection<String> professions = persons.values();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        for (Map.Entry<Employee, String> entry : persons.entrySet()) {
            System.out.println("Сотрудник: " + entry.getKey().getName() + ", Профессия: " + entry.getValue());
        }

        raiseSalaryForProfession(persons, 200);
        for (Map.Entry<Employee, String> entry : persons.entrySet()) {
            System.out.println("Сотрудник: " + entry.getKey().getName()  + " с зарплатой "+entry.getKey().getSalary() + ", Профессия: " + entry.getValue());
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> persons, int amountOfIncrease) {

        Set<Map.Entry<Employee, String>> entries = persons.entrySet();
        Iterator<Map.Entry<Employee, String>> it = entries.iterator();

        while (it.hasNext()) {
            Map.Entry<Employee, String> entry = it.next();
            Employee emp = (Employee) entry.getKey();
            String profession = (String) entry.getValue();

            if (profession.equals("Плотник")) {
                emp.setSalary(emp.getSalary() + amountOfIncrease);
            }
        }
    }
}

