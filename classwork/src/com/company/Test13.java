package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Test13 {
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
                    TimeUnit.NANOSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // до исключения поток может уснуть несклько раз
                    System.err.println("InterruptedException");
                    currentT.interrupt(); // без даного вызова может завершится, а может и нет
                    //зависит от момента когда сработает t2.interrupt() и состояния sleep в этот момент
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
