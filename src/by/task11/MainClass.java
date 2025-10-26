package by.task11;

import by.task11.enums.EnumRobotType;

/**
 * Задачи
 * 1.1 Создать классы роботов.
 * 1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар)
 * и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)
 * 1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
 * 1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит,
 * строитель строит и т.д.)
 * 1.5 Добавить интерфейс, который будет называться РоботИнженер. Он должен расширить интерфейс Робот.
 * От этого интерфейса должны наследоваться РоботСапёр и РоботСтроитель. В этом интерфейсе определите
 * абстрактный метод createItem (Робот строитель создаёт бетон, РоботСапёр создаёт приспособление
 * для разминирования).
 * <p>
 * 1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все
 * виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов.
 * Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены
 * на выставках (вызвать метод uniquePossibility)
 * Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод
 * createItem на каждом Роботе, который есть на выставке.
 */
public class MainClass {
    static void main() {
        RobotSapper robotSapper = new RobotSapper("Bosh", 545, 544, "сталь", true);
        RobotBuilder robotBuilder = new RobotBuilder("Bosh", 545, "Japan", "стены", "бетон", true);
        RobotCook robotCook = new RobotCook("Bosh", 545, "Japan", "кострюля", true);
        RobotBuilder robotBuilder2 = new RobotBuilder("Bosh", 545, "Japan", "стены", "бетон", true);
        RobotSapper robotSapper2 = new RobotSapper("Bosh", 545, 544, "сталь", true);

        Robot robotSapper1 = new RobotSapper("Bosh", 545, 544, "сталь", true);
        Robot robotBuilder1 = new RobotBuilder("Bosh", 545, "Japan", "стены", "бетон", true);
        Robot robotCook1 = new RobotCook("Bosh", 545, "Japan", "кострюля", true);


        System.out.println(EnumRobotType.BUILDER);
        System.out.println("name " + EnumRobotType.BUILDER.name());
        System.out.println("ordinal " + EnumRobotType.BUILDER.ordinal());
        System.out.println("gettype " + EnumRobotType.BUILDER.getType());

        robotSapper.fix();
        robotBuilder.fix();
        robotCook.fix();

        robotSapper1.fix();
        robotBuilder1.fix();
        robotCook1.fix();

        robotSapper.uniquePossibility();
        robotBuilder.uniquePossibility();
        robotCook.uniquePossibility();

        Robot robots[] = {robotSapper, robotBuilder, robotCook};
        for (Robot robot : robots
        ) {
            robot.isOn();
            robot.uniquePossibility();
            robot.fix();
            robot.isOff();
        }

        RobotEngineer robotsEngineer[] = {robotBuilder, robotBuilder2, robotSapper};
        for (RobotEngineer robotEngineer : robotsEngineer
        ) {
            robotEngineer.createItem();
        }

        RobotSapper sappers[] = {robotSapper, robotSapper2};
        for (RobotSapper robotSappers : sappers
        ) {
            robotSappers.createItem();
            robotSappers.isOn();
            robotSappers.uniquePossibility();
            robotSappers.fix();
            robotSappers.isOff();
        }
    }
}
