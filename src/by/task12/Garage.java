package by.task12;
/**1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты
 *  типа наследуемого от Vehicle.*/
public class  Garage<T extends Vehicle > {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void nameOfClass(){
        System.out.println(vehicle.getClass().getName());
    }

    public void info(){
        System.out.println("Имя " + vehicle.getName() + " загрязнение " + vehicle.getAmountPollution());
    }

    public void Allow(){
        if (vehicle.isEntryPermitted()) {
            System.out.println("Въезд разрешен");
        }
        else {
            System.out.println("Въезд запрещен");
        }
    }
}
