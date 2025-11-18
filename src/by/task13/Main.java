package by.task13;

import by.task13.enums.FacultyAct;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**2. Создать класс студент (Student), группа (Group), факультет (Faculty).
  *  Реализовать во всех классах методы геттеры и сеттеры.
 *  1.1. Создать несколько студентов.
 * 1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
 * 1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)*/
public class Main {
    static void main() {
        Date birthday = new Date(2007, Calendar.MARCH, 1);
        Student student = new Student("Петр", "Петров", birthday, "Лида", 7.4);
        Date birthday1 = new Date(2007, Calendar.JULY, 6);
        Student student1 = new Student("Сева", "Кот", birthday1, "Ивье", 8.2);
        Date birthday2 = new Date(2008, Calendar.NOVEMBER, 20);
        Student student2 = new Student("Юля", "Власова", birthday2, "Минск", 7.2);

        List<Student> students1 = new ArrayList<>();
        students1.add(student);
        students1.add(student1);

        List<Student> students2 = new ArrayList<>();
        students2.add(student2);

        Group group1 = new Group("ПОИТ-1", students1);
        System.out.println("Исходный список студентов группы " + group1.getGroup() +" : " + group1.getStudents());
        Group group2 = new Group("ПОИТ-2", students2);
        System.out.println("Исходный список студентов группы " + group2.getGroup() +" : " + group2.getStudents());

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);

        int marklow = 8;
        System.out.println("Удаление студентов со средним баллом ниже " + marklow);
        group1.removeStudentsByMark(marklow);
        System.out.println("Исходный список студентов группы " + group1.getGroup() +" : " + group1.getStudents());

        System.out.println("Перевод студентов из группы " + group1.getGroup() + " в группу " + group2.getGroup());
        group1.transferToGroup(group2);
        System.out.println("Исходный список студентов группы " + group1.getGroup() +" : " + group1.getStudents());
        System.out.println("Исходный список студентов группы " + group2.getGroup() +" : " + group2.getStudents());

        double avMark = group2.avarageMarkGroup();
        System.out.println("Средний балл по группе " + group2.getGroup() + " : "  + avMark);

        Faculty faculty = new Faculty("Математический",groups, FacultyAct.ACTIVE);
        faculty.changeStatus();
        System.out.println("Студенты в порядке возрастания: ");
        faculty.listAvarageMark(true);
        System.out.println("Студенты в порядке убывания: ");
        faculty.listAvarageMark(false);
    }
}
