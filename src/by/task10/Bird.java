package by.task10;

/**
 * * Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
 * * клевать, высиживать птенцов.
 */
public class Bird extends Animal {
    private String birdType;
    private int flyingHeight;

    public Bird(String color, int lifetime, String foodtype, String birdType, int flyingHeight) {
        super(color, lifetime, foodtype);
        this.birdType = birdType;
        this.flyingHeight = flyingHeight;
        System.out.println("Конструктор с параметрами класса Птица");
    }

    public Bird() {
        super();
        System.out.println("Конструктор класса Птица");
    }

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    public int getFlyingHeight() {
        return flyingHeight;
    }

    public void setFlyingHeight(int flyingHeight) {
        this.flyingHeight = flyingHeight;
    }

    public void makeSound() {
        System.out.println("Птица поет");
    }

    public void peck() {
        System.out.println(birdType + " клюет");
    }

    public void incubate() {
        System.out.println(birdType + " высиживает птенцов");
    }

    public void play() {
        System.out.println("Птица прыгает с ветки на ветку");
    }

    public String toString() {
        String result = super.toString();
        result = result + " Семейство: " + birdType +
                ", максимальная высота полёта: " + flyingHeight;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) o;
        if (birdType.equals(bird.getBirdType()) && flyingHeight == bird.getFlyingHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return birdType.hashCode() + Double.toString(flyingHeight/10).hashCode();
    }
}
