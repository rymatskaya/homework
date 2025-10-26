package by.task11;
/**
 *  * 1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:
 *  * Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать
 *  * уникальные способности (uniquePossibility).*/
public interface Robot {

    public static String BUILDER_INT ="Строитель";
    public static String SAPPER_INT ="Сапер";
    public static String COOK_INT ="Повар";

    default void fix() {
        System.out.println("Робот отремонтирован.");
    }
    public abstract void isOn();
    public abstract void isOff();
    public abstract void uniquePossibility();
}

