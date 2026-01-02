package multithreading.synchronization.locks;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        one.start();
        two.start();

        one.join();
        two.join();
        System.out.println("count : " + counter.getCount()); // equal to 20,000
    }
}

