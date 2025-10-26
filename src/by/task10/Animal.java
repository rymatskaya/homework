package by.task10;

import java.util.Objects;

/**
 * Поля в классе животное:
 * * окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
 * * Определить методы в классе животное: (издание звуков, животное играет)
 */
public abstract class Animal extends Zoo {
    private static int count = 0;
    private String color;
    private int lifetime;
    private String foodtype;
    private int id;

    public Animal(String color, int lifetime, String foodtype) {
        this.id = ++count;
        this.color = color;
        this.lifetime = lifetime;
        this.foodtype = foodtype;
        System.out.println("Конструктор с параметрами класса Животное");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal() {
        System.out.println("Конструктор класса Животное");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public abstract void makeSound();// {
    //    System.out.println("Животное издает звук");
    //}

    public abstract void play(); //{
        //System.out.println("Животное играет");
   // }

    public String toString() {
        String result = "";
        result = result + "id: " + id +" окрас: " + color +
                ", максимальная продолжительность жизни: " + lifetime +
                ", тип еды, которой питаются: " + foodtype;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return getLifetime() == animal.getLifetime() && getId() == animal.getId()
                && Objects.equals(getColor(), animal.getColor())
                && Objects.equals(getFoodtype(), animal.getFoodtype());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getLifetime(), getFoodtype(), getId());
    }
}

