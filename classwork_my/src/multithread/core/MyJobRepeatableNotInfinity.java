package multithread.core;

import java.util.concurrent.TimeUnit;

public class MyJobRepeatableNotInfinity implements Runnable {
    @Override
    public void run() {
        String oldName = Thread.currentThread().getName();
        Thread.currentThread().setName("Order 7777");
        try {
        ThredUtils.printAboutCurrentTred();
        int i = 1;
        while(i < 11) {
            i++;
            try {
                TimeUnit.MILLISECONDS.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "_");
        }
        } finally {
            Thread.currentThread().setName(oldName);
        }
    }
}
