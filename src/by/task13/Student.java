package by.task13;

import java.util.Date;

/**У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.*/
public class Student {
    private String name;
    private String surname;
    private Date birthdate;
    private String city;
    private Double avarageMark;

    public Student(String name, String surname, Date birthdate, String city, Double avarageMark) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.city = city;
        this.avarageMark = avarageMark;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(Double avarageMark) {
        this.avarageMark = avarageMark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", city='" + city + '\'' +
                ", avarageMark=" + avarageMark +
                '}';
    }
}
