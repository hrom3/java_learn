package test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Test9 {
    static long a = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 100L; i++) {
                a += 1;
                System.err.println("setter a = " + a);
            }
        });

        Thread t2 = new Thread(() ->{
            Thread currentT = Thread.currentThread();
            while (!currentT.isInterrupted()) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException swallowed) {
                    System.err.println("Исключение получено");
                    // Так делать крайне не рекомендуется поток может не завершится
                }
                System.err.println("monitoring a = " + a);
            }
        });

        t2.start();
        t1.start();

        try {
            t1.join();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
