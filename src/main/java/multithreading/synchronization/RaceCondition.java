package multithreading.synchronization;

public class RaceCondition {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        });

        one.start();
        two.start();

        one.join();
        two.join();
        System.out.println("count : " + count); // not equal to 20,000
    }
}

