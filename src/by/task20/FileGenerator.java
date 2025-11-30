package by.task20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FileGenerator implements Callable <List<String>> {
    private final int taskId;

    public FileGenerator(int taskId) {
        this.taskId = taskId;
    }

    private final Random random = new Random();

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.printf("[%s] Задача %d: выполнение\n", threadName, taskId);


        List<String> generatedFileNames = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String fileName = String.format("task%d_file%d.txt", taskId, i);
            File file = new File(fileName);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int j = 1; j <= 10; j++) {
                    String randomLine = generateRandomString(10);
                    writer.write(randomLine);
                    writer.newLine();
                }
                generatedFileNames.add(fileName);
                System.out.printf("[%s] Задача %d: Создан файл: %s\n", threadName, taskId, fileName);
            } catch (IOException e) {
                System.err.printf("[%s] Задача %d: Ошибка при записи файла %s: %s\n", threadName, taskId, fileName, e.getMessage());
            }
        }

        // 2. Засыпает произвольно на 1-3 секунды
        // (1000 + random.nextInt(2000)) дает диапазон [1000, 2999] миллисекунд (т.е. 1 до 3 секунд)
        long sleepTime = 1000 + random.nextInt(2000);
        System.out.printf("[%s] Задача %d: Засыпаю на %d мс...\n", threadName, taskId, sleepTime);
        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.printf("[%s] Задача %d была прервана во время сна.\n", threadName, taskId);
            return generatedFileNames; // Возвращаем, что успели сделать
        }

        System.out.printf("[%s] Задача %d: Завершила работу.\n", threadName, taskId);
        return generatedFileNames;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
             sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
