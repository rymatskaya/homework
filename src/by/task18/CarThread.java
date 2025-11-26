package by.task18;
/**Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
 Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).*/
public class CarThread extends Thread{
    private String carName;
    private String registrationNumber;
    private long stopTime;

    public CarThread(String carName, String registrationNumber, long stopTime) {
        this.carName = carName;
        this.registrationNumber = registrationNumber;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        try {
                System.out.println(carName + " (" + registrationNumber + ") едет");
                Thread.sleep(1000); // пауза 1 секунда

                if (System.currentTimeMillis() - stopTime <= 5000) {
                    stopCar();
                }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void stopCar() {
        System.out.println(carName + " (" + registrationNumber + ") остановилась");
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }


}
