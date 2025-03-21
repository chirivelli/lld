package multithreading.threadPool;

import multithreading.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 10; i++) {
                service.execute(new Task(i));
            }
        }
    }
}