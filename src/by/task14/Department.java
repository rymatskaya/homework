package by.task14;

import by.task14.enums.Sex;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
 */
public class Department {
    private String departmentName;
    Set<Ward> wards;

    public Department(String departmentName, Set<Ward> wards) {
        this.departmentName = departmentName;
        this.wards = wards;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    public void count() {
        Set<Ward> wards = new HashSet<>();
        wards = this.getWards();
        int countWomen = 0;
        int countMen = 0;
        for (Ward ward : wards) {
            countWomen = ward.countPatients(Sex.FAMALE) + countWomen;
            countMen = countMen + ward.countPatients(Sex.MALE);

        }

        System.out.println("Количество мужчин " + countMen);
        System.out.println("Количество женщин " + countWomen);

    }
}
