package by.task11;
/**РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер),
 * материал, включение робота (boolean isOn)
 * В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)*/
public class RobotSapper implements Robot, RobotEngineer{
    private String model;
    private int power;
    private int chassisNumber;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int power, int chassisNumber, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void fix() {
        System.out.println("РоботСапёр отремонтирован.");
    }

    @Override
    public void isOn() {
        isOn = true;
        System.out.println("РоботСапёр включен.");
    }

    @Override
    public void isOff() {
        isOn = false;
        System.out.println("РоботСапёр выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботСапёр умеет разминировать.");
    }

    @Override
    public void createItem() {
        System.out.println("РоботСапёр создаёт приспособление для разминирования.");
    }
}
