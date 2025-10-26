package by.task10;

public class Lion extends Animal{
    public Lion() {
    }

    public Lion(String color, int lifetime, String foodtype) {
        super(color, lifetime, foodtype);
    }

    public void makeSound() {
        System.out.println("Лев рычит.");
    }


    public void play() {
        System.out.println("Лев играет.");
    }
}
