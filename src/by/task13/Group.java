package by.task13;

import java.util.ArrayList;
import java.util.List;

/**
 * У группы: номер группы, коллекция студентов (List<Student> students)
 * 1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех,
 * у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
 * Сигнатура метода: public void removeStudentsByMark(int mark);
 * 1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
 * (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
 * 1.6. Реализовать метод в классе Group, который считает средний бал по группе.
 * Сигнатуру и название придумайте сами.
 */
public class Group {
    private String group;
    private List<Student> students;

    public Group(String group, List<Student> students) {
        this.group = group;
        this.students = students;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void removeStudentsByMark(int mark) {
        for (Student student : students) {
            if (student.getAvarageMark() < mark) {
                students.remove(students.indexOf(student));
            }
        }
    }

    public void transferToGroup(Group newGroup) {
        List<Student> moveStudents = new ArrayList<>();
        if (students.size() < 2) {
            for (Student student : students) {
                newGroup.students.add(student);
            }
            this.students.clear();
        }
    }

    public Double avarageMarkGroup() {
        double avMark = 0;
        for (Student student : students) {
            avMark += student.getAvarageMark();
        }

        return avMark / students.size();
    }
}

