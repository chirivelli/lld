package multithreading.concurrency;

public class BasicConcurrency {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}