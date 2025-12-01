package by.task17;

import java.io.Serializable;

/** 2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
 *  Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).*/

public class Car implements Serializable {
    private String model;
    private int maxSpeed;
    private String country;

    public Car(String model, int maxSpeed, String country) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + model + ", максимальная скорость: " + maxSpeed + ", страна: " + country;
    }
}
