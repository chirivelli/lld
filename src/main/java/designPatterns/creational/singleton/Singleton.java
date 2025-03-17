package designPatterns.creational.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton Constructor");
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}