package test;

import java.util.concurrent.CountDownLatch;

public class Test6 {
    static long a = 0;

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 100L; i++) {
                a += 1;
                System.err.println("setter a = " + a);
            }
            latch.countDown();
        });

        Thread t2 = new Thread(() -> {
            Thread currentT = Thread.currentThread();
            while (!currentT.isInterrupted()) { // не меняет флаг состояния
                System.err.println("Флаг прерывания в цикле 1 = "
                        + Thread.currentThread().isInterrupted());
                System.err.println("monitoring a = " + a);
            }
            System.err.println("Флаг прерывания до цикла 2 = "
                    + Thread.currentThread().isInterrupted());
            while (!currentT.isInterrupted()) { // не меняет флаг состояния
                System.err.println("\tmonitoring B = " + a); // данный метод не выполнится
            }
        });

        t2.start();
        t1.start();

        try {
            latch.await();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
