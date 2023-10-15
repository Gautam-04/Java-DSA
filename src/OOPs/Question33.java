package OOPs;

import java.io.IOException;

public class Question33 {
    public static void main(String[] args) throws IOException {
        Ac ThreadAc = new Ac();
        Bc ThreadBc = new Bc();

        ThreadAc.start(); // Start Thread A
        ThreadBc.start(); // Start Thread B
    }
}

class Ac extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " From Thread A");
        }
        System.out.println("Thread A ended");
    }
}

class Bc extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " From Thread B");
        }
        System.out.println("Thread B ended");
    }
}
