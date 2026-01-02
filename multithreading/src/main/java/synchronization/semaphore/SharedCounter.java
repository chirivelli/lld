package multithreading.synchronization.semaphore;

import java.util.concurrent.Semaphore;

public class SharedCounter {
    private int count = 0;
    private final Semaphore semaphore = new Semaphore(1, true);

    public void increment() throws InterruptedException {
        semaphore.acquire();
        count++;
        semaphore.release();
    }

    public int getCount() {
        return count;
    }
}
