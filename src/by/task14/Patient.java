package by.task14;

import by.task14.enums.Sex;

import java.util.Objects;

/**
 * 1.1 У пациента поля:
 * уникальный идентификатор, имя, фамилия, диагноз, возраст,
 * пол (сделать enum класс: Мужской, Женский).*/
public class Patient /*implements Comparable<Patient>*/  {
    private int unId;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Sex sex;

    public int getUnId() {
        return unId;
    }

    public void setUnId(int unId) {
        this.unId = unId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Patient(int unId, String name, String surname, String diagnosis, int age, Sex sex) {
        unId = unId;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unId,name,surname,diagnosis,age,sex);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()) return false;
        Patient patient = (Patient) obj;
        return unId == patient.unId && Objects.equals(name, patient.name)
                && Objects.equals(surname, patient.surname)  && Objects.equals(diagnosis, patient.diagnosis)
                && age == patient.age && Objects.equals(sex, patient.sex);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "unId=" + unId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

//    @Override
//    public int compareTo(Patient o) {
//        return Integer.compare(this.unId, o.unId);
//    }
}
