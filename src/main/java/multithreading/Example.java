package multithreading;

public class Example {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());

        thread1.start();
        thread2.start();
    }
}

class ThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread One : " + i);
        }
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Two : " + i);
        }
    }
}