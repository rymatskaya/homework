package by.task12;
/**1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его
 *  через конструктора.
 *  1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
 *  1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж
 * * в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted());
 * * Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён,
 * * если меньше 100 – въезд разрешён.*/
public class Vehicle {
    private String name;
    private Integer amountPollution;

    public Vehicle(String name, Integer amountPollution) {
        this.name = name;
        this.amountPollution = amountPollution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountPollution() {
        return amountPollution;
    }

    public void setAmountPollution(Integer amountPollution) {
        this.amountPollution = amountPollution;
    }

    public Boolean isEntryPermitted() {
        if (this.getAmountPollution() <= 100) {
            return true;
        }
        return false;
    }

}
