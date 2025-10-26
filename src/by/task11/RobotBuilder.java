package by.task11;
/*** РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства,
        * материал, включение робота (boolean isOn.)*/
public class RobotBuilder implements Robot, RobotEngineer{
    private String model;
    private int power;
    private String country;
    private String BuildUnit;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int power, String country, String buildUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        BuildUnit = buildUnit;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void isOn() {
        isOn = true;
        System.out.println("РоботСроитель включен.");
    }

    @Override
    public void isOff() {
        isOn = false;
        System.out.println("РоботСроитель выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботСроитель умеет строить.");
    }

    @Override
    public void createItem() {
        System.out.println("Робот строитель создаёт бетон.");
    }
}
