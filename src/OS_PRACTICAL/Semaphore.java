package OS_PRACTICAL;

import java.util.PriorityQueue;

class Semaphore1{
    private int value;
    private PriorityQueue<Integer> queue;

    public Semaphore1(int value) {
        this.value = value;
        this.queue = new PriorityQueue<>();
    }

    public void getSemaphore() {
        System.out.println("Semaphore Value: " + this.value);
    }

    public void block(int process) {
        System.out.println("Process " + process + " Blocked.");
    }

    public void wakeup(int process) {
        System.out.println("Process " + process + " Waked Up and Completed its work.");
    }

    public synchronized void P() {
        value--;
        int process = ThreadCounter.getCounter();
        if (value < 0) {
            queue.offer(process);
            block(process);
            ThreadCounter.incrementCounter();
        } else {
            System.out.println("Process " + process + " gone inside the Critical Section.");
            ThreadCounter.incrementCounter();
        }
    }

    public synchronized void V() {
        value++;
        if (value <= 0) {
            int process = queue.poll();
            wakeup(process);
            ThreadCounter.decrementCounter();
        } else {
            int process = ThreadCounter.getCounter();
            System.out.println("Process " + process + " completed its work.");
            ThreadCounter.decrementCounter();
        }
    }
}

class Semaphore {
    public static void main(String[] args) {
        Semaphore1 s1 = new Semaphore1(2);
        s1.getSemaphore();

        s1.P();
        s1.getSemaphore();
        s1.P();
        s1.getSemaphore();
        s1.P();
        s1.getSemaphore();
        s1.V();
        s1.getSemaphore();
        s1.V();
        s1.getSemaphore();
        s1.V();
        s1.getSemaphore();
    }

}

class ThreadCounter {
    private static int counter = 1;

    public static synchronized int getCounter() {
        return counter;
    }

    public static synchronized void incrementCounter() {
        counter++;
    }

    public static synchronized void decrementCounter() {
        counter--;
    }
}



