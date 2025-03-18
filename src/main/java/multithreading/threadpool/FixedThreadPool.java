package multithreading.threadpool;

import multithreading.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            for (int i = 0; i < 10; i++) {
                service.execute(new Task(i));
            }
        }
    }
}
