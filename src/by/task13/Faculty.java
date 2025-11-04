package by.task13;

import by.task13.enums.FacultyAct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**У факультета:  наименование факультета, список групп (List<Group> groups. )
 * 1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный)
 * и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
 * 1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете
 * меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)
 * 1.9*. Вывести студентов в порядке возрастания среднего бала
 * 1.10*. Вывести студентов в порядке убывания среднего бала
 */

public class Faculty {
    private String faculty;
    private List<Group> groups;
    private FacultyAct act;

    public Faculty(String faculty, List<Group> groups, FacultyAct act) {
        this.faculty = faculty;
        this.groups = groups;
        this.act = act;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getAct() {
        return act.getType();
    }

    public void setAct(FacultyAct act) {
        this.act = act;
    }

    public void changeStatus() {
        List<Group> groups = new ArrayList<Group>();
        groups = this.getGroups();
        int count = 0;
        for (Group group : groups) {
            List<Student> students = new ArrayList<Student>();
            students = group.getStudents();
            count = count + students.size();
        }
        if (count < 20)  {
            this.setAct(FacultyAct.NOT_ACTIVE);
        }
        else {
            this.setAct(FacultyAct.ACTIVE);
        }
        System.out.println("Статус факультета " + this.act.getType());
    }

    public void listAvarageMark(boolean minmax){
        List<Group> groups = new ArrayList<Group>();
        groups = this.getGroups();
        int count = 0;
        for (Group group : groups) {
            List<Student> students = new ArrayList<Student>();
            students = group.getStudents();
            if (minmax) {
                students.sort(Comparator.comparingDouble(Student::getAvarageMark));
            }
            else {
                students.sort(Comparator.comparingDouble(Student::getAvarageMark).reversed());
            }
        }
        for (Group group : groups) {
            List<Student> students = new ArrayList<Student>();
            students = group.getStudents();
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }
}
