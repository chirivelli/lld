package multithreading.concurrency;

public class BasicConcurrency {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Three : " + i);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}