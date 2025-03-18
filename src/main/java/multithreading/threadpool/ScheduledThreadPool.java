package multithreading.threadpool;

import multithreading.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) throws InterruptedException {
        try (ScheduledExecutorService service = Executors.newScheduledThreadPool(1)) {
            service.scheduleAtFixedRate(new Task(0), 1000, 2000, TimeUnit.MILLISECONDS);

            if (service.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
                service.shutdownNow();
            }
        }
    }
}
