package by.task18.runnable;

public class CarRunnable implements Runnable{
    private String carName;
    private String registrationNumber;
    private long stopTime;

    public CarRunnable(String carName, String registrationNumber, long stopTime) {
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
