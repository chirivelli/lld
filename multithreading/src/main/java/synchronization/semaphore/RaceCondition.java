package multithreading.synchronization.semaphore;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        one.start();
        two.start();

        one.join();
        two.join();
        System.out.println("count : " + counter.getCount()); // equal to 20,000
    }
}

