package by.task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками ->
 * засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов.
 * Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с
 * указанием имени потока, который выполняет работу.*/
public class Main {
    static void main() {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        System.out.println("  Создаем 10 заданий " );
        List<Callable<List<String>>> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tasks.add(new FileGenerator(i));
        }

        List<Future<List<String>>> results = new ArrayList<>();
        try {
            results = executorService.invokeAll(tasks);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Основной поток был прерван во время ожидания задач.");
        } finally {
            executorService.shutdown();
            System.out.println("\nExecutorService остановлен.");
        }

        int totalFiles = 0;

        for (int i = 0; i < results.size(); i++) {
            try {

                List<String> fileNames = results.get(i).get();

                System.out.println("  Файлы: " + fileNames);
                totalFiles += fileNames.size();

            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Ошибка при получении результата задачи: " + e.getMessage());
            }
        }

    }
}
