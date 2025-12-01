package by.task18;

import by.task18.runnable.CarRunnable;

/*1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
 Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main.
Выносите методы в private static void согласно заданиям.
1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
 Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
 В последствии поток будет спать переданное время.
1.3 Запустить три потока с машинами. При этом 2 машины начнут двигаться только после того,
 как 1 машина прекратит езду (прекратит выполнение потока) (метод join)
1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашнем заданием,
пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующем изменением.*/
public class Main {
    static void main() {

        CarThread carThread1 = new CarThread("Toyota", "53lppiС", System.currentTimeMillis());
        CarThread carThread2 = new CarThread("BMW", "5uiiОП", System.currentTimeMillis() + 11000);

        for (int i = 0; i < 3; i++) {
            Thread thread1 = new Thread(carThread1);
            thread1.start();
            Thread thread2 = new Thread(carThread2);
            thread2.start();
        }


        Thread thread1 = new Thread(carThread1);
        Thread thread2 = new Thread(carThread2);
        Thread thread3 = new Thread(carThread1);

        try {
            Thread.sleep(1000);
        }// Подождем 1 секунду
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try {
            thread3.join();
        } // Ожидаем завершения thread3
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        thread1.start();
        thread2.start();

        CarRunnable carRunnable1 = new CarRunnable("Toyota", "53lppiС", System.currentTimeMillis());
        CarRunnable carRunnable2 = new CarRunnable("BMW", "5uiiОП", System.currentTimeMillis() + 11000);

        for (int i = 0; i < 3; i++) {
            Thread threadRun1 = new Thread(carRunnable1);
            threadRun1.start();
            Thread threadRun2 = new Thread(carRunnable2);
            threadRun2.start();
        }
    }
}
