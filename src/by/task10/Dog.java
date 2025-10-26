package by.task10;

/**
 * В классе собака определить имя,
 * * порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
 * * При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
 */
public class Dog extends Animal {
    private String name;
    private String breed;
    private Double averageWeight;

    public Dog(String color, int lifetime, String foodtype, String name, String breed, Double averageWeight) {
        super(color, lifetime, foodtype);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
        System.out.println("Конструктор с параметрами класса Собака");
    }

    public Dog() {
        super();
        System.out.println("Конструктор класса Собака");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(Double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void makeSound() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void play() {
        System.out.println(name + " играет в мяч");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public String toString() {
        String result = super.toString();
        result = result + " Имя: " + name +
                ", порда: " + breed +
                ", средний возраст: " + averageWeight;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) o;
        if (name.equals(dog.getName()) && breed.equals(dog.getBreed()) &&
                Double.compare(averageWeight, dog.averageWeight) == 0) {
            return true;
        }
        return false;
    }

        @Override
    public int hashCode() {
        return name.hashCode()+breed.hashCode()+Double.toString(averageWeight).hashCode();    }
}