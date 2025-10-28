package by.task12;
/*
*  Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)

1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного
*  средства и проверить разрешён ли въезд транспортного средства в гараж.*/
public class Main {
    static void main() {
        Motorcycle motorcycle = new Motorcycle("bmw310g", 25);
        Car car = new Car("Skoda", 415);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);
        System.out.println("Вызов методов дженерика для мота");
        motorcycleGarage.nameOfClass();
        motorcycleGarage.info();
        motorcycleGarage.Allow();
        Garage<Car> carGarage = new Garage<>(car);
        System.out.println("Вызов методов дженерика для авто");
        carGarage.nameOfClass();
        carGarage.info();
        carGarage.Allow();
    }
}
