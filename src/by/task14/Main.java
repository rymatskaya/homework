package by.task14;

import by.task14.enums.Sex;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
 * При этом попробуйте добавит двух пациентов, с одинаковыми полями. Если количество пациентов
 * в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.
 * 1.5 Посчитать количество мужчин и женщин в отделении.
 */
public class Main {
    static void main() {
        Patient patient1 = new Patient(1,"Петр", "Петров", "инфаркт", 35, Sex.MALE);
        Patient patient2 = new Patient(2,"Петр", "Иванов", "инфаркт", 54, Sex.MALE);
        Patient patient3 = new Patient(3,"Алена", "Петрова", "порок сердца", 32, Sex.FAMALE);
        Patient patient4 = new Patient(4,"Ольга", "Кот", "порок сердца", 33, Sex.FAMALE);
        Patient patient5 = new Patient(4,"Ольга", "Кот", "порок сердца", 33, Sex.FAMALE);
        Patient patient6 = new Patient(5,"Инна", "Кот", "порок сердца", 33, Sex.FAMALE);

        Set<Patient> patients1 = new HashSet<>();
        patients1.add(patient1);
        patients1.add(patient2);

        for (Patient patient : patients1) {
            System.out.println(patient);
        }

        Set<Patient> patients2 = new HashSet<>();
        patients2.add(patient3);
        patients2.add(patient4);
        patients2.add(patient5);
        patients2.add(patient6);

//        for (Patient patient : patients2) {
//            System.out.println(patient);
//        }

//        Ward ward1 = new Ward(12, Sex.MALE, patients1);
//        Patient patient7 = new Patient(10,"Колян", "Крот", "глисты", 78, Sex.MALE);
//        ward1.addBasedDiagnosis(patient7);
        Patient patient8 = new Patient(9,"Ян", "Лях", "инфаркт", 44, Sex.MALE);
//        ward1.addBasedDiagnosis(patient8);
//        Ward ward2 = new Ward(21, Sex.FAMALE, patients2);
        Patient patient9 = new Patient(8,"Маша", "Сидорова", "порок сердца", 43, Sex.FAMALE);
//        ward2.addBasedDiagnosis(patient9);
//        Set<Ward> wards = new HashSet<Ward>();
//        wards.add(ward1);
//        wards.add(ward2);

//        Department department = new Department("Кардиология", wards);
//        department.count();
//
//        ward1.print();
//        ward2.print();

        /** * 1.8*. Сортировать пациентов по идентификационному номеру. (коллекция TreeSet, интерфейс Comparable)
         * Для этого в классе Палата пациенты должны лежать в коллекции TreeSet. А класс пациент должен
         * имплементировать интерфейс Comparable*/
        Set<Patient> patientsTreeSet = new TreeSet<>();
        patientsTreeSet.add(patient5);
        patientsTreeSet.add(patient8);
        patientsTreeSet.add(patient9);

        Ward ward3 = new Ward(6, Sex.FAMALE, patientsTreeSet);
        ward3.print();

    }
}
