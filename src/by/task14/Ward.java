package by.task14;

import by.task14.enums.Sex;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
 */
public class Ward {
    private int number;
    private Sex typeSex;
    Set<Patient> patients;

    public Ward(int number, Sex typeSex, Set<Patient> patients) {
        this.number = number;
        this.typeSex = typeSex;
        this.patients = patients;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Sex getTypeSex() {
        return typeSex;
    }

    public void setTypeSex(Sex typeSex) {
        this.typeSex = typeSex;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public int countPatients(Sex typeSex) {
        int count = 0;
        patients = this.getPatients();
        for (Patient patient : patients) {
            if (patient.getSex() == typeSex) {
                count++;
            }
        }
        return count;
    }
/*** 1.6 Реализовать метод добавления пациента в палату на основе диагноза.
 * Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.*/
    public boolean addBasedDiagnosis(Patient newpatient){
        patients = this.getPatients();
        if (patients.size()>=3) {
            System.out.println("Палата заполнена!");
            return false;
        }
        for (Patient pat : patients) {
            if (pat.getDiagnosis() == newpatient.getDiagnosis()) {
                patients.add(newpatient);
                System.out.println("Пациент " + newpatient.getName() + " добавлен в палату " + number);
                return true;
            } else {
                System.out.println("Ошибка: Диагноз пациента (" + newpatient.getDiagnosis() +
                        ") не соответствует требуемому диагнозу палаты (" + pat.getDiagnosis()+ ").");
                return false;
            }
        }
        return false;
    }
    /**1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.*/
    public void print() {
        System.out.println("Палата №" + number );
        if (patients.isEmpty()) {
            System.out.println("Нет пациентов");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient.toString());
            }
        }
    }
}
