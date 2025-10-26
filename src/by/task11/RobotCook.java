package by.task11;
/**
 *  * РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления,
 *  * включение робота (boolean isOn).*/
public class RobotCook implements Robot{

    private String model;
    private int power;
    private String country;
    private String cookingUnit;
    private boolean isOn;

    public RobotCook(String model, int power, String country, String cookingUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    @Override
    public void isOn() {
        isOn = true;
        System.out.println("РоботПовар включен.");
    }

    @Override
    public void isOff() {
        isOn = false;
        System.out.println("РоботПовар выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботПовар умеет готовить.");
    }
}
