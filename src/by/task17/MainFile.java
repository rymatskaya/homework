package by.task17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main.
 * 1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
 * 1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
 * 1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
 * <p>
 * В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий
 * метод в классе Main
 * 2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в
 * классе Main
 */


public class MainFile {
    private static final String text = "The Rostóvs knew everybody in Moscow." +
            " The old count had money enough that year, as all his estates had been remortgaged, " +
            "and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the" +
            " latest cut, such as no one else yet had in Moscow, and boots of the latest fashion," +
            " with extremely pointed toes and small silver spurs, passed his time very gaily. After " +
            "a short period of adapting himself to the old conditions of life, Nicholas found it " +
            "very pleasant to be at home again. He felt that he had grown up and matured very much. " +
            "His despair at failing in a Scripture examination, his borrowing money from Gavríl " +
            "to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as " +
            "childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a " +
            "jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for " +
            "bravery in action, and in the company of well-known, elderly, and respected racing men" +
            " was training a trotter of his own for a race. He knew a lady on one of the boulevards " +
            "whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about " +
            "the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms " +
            "with a colonel of forty to whom Denísov had introduced him. ";

    static void main() {
        writeToRelativeFile();
        writeToAbsoluteFile();

        try {
            Thread.sleep(1000); // небольшая задержка для корректной работы
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        readFromRelativeFile();
        readFromAbsoluteFile();


        // Создаем объект автомобиля
        Car car = new Car("bmw", 254, "USA");

        // Сериализуем объект
        writeSer(car);

        // Десериализуем и выводим результат
        Car deserializedCar = readSer();
        if (deserializedCar != null) {
            System.out.println(deserializedCar);
        }
    }

    public static void writeSer(Car car) {
        try {
            FileOutputStream fileOut = new FileOutputStream("cars.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
            fileOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Car readSer() {
        Car car = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cars.ser"))) {
            car = (Car) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return car;
    }

    // 1.1 Запись в файл с относительным путем
    public static void writeToRelativeFile() {
        try (FileWriter writer = new FileWriter("output_rel.txt")) {
            writer.write(text);
            System.out.println("Данные записаны в файл с относительным путем");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // 1.2 Запись в файл с абсолютным путем
    public static void writeToAbsoluteFile() {
        try (FileWriter writer = new FileWriter("d:\\Irka\\Java\\Java_Vadarod\\output_abs.txt")) {
            writer.write(text);
            System.out.println("Данные записаны в файл с абсолютным путем");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // 1.3 Чтение из файла с относительным путем
    public static void readFromRelativeFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output_rel.txt"))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Содержимое файла с относительным путем:\n" + content);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

    // 1.4 Чтение из файла с абсолютным путем
    public static void readFromAbsoluteFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("d:\\Irka\\Java\\Java_Vadarod\\output_abs.txt"))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Содержимое файла с абсолютным путем:\n" + content);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }
}
