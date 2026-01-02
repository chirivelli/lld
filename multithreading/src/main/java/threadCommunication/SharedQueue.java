package multithreading.threadCommunication;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    private Queue<Integer> queue;

    private final int capacity;

    public SharedQueue(int capacity) {
        this.queue  = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            this.wait();
        }
        queue.add(value);
        System.out.println("Produced " + value);
        this.notify();
    }

    public synchronized void poll() throws InterruptedException {
        while (queue.isEmpty()) {
            this.wait();
        }
        int result = queue.poll();
        System.out.println("Consumed " + result);
        this.notify();
    }
}
