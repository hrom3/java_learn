package test2;

import java.util.concurrent.TimeUnit;

public class Test11 {
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
            int i = 0;
            boolean interrupted = false;
  //          try {
                while (i < 5) {
                    i++;
                    try {
                        TimeUnit.SECONDS.sleep(2);

                    } catch (InterruptedException e) {
//                        interrupted = true; // fall through and retry
                        System.err.println("Исключение получено");
                    }
                    System.err.println("Данная работа должна завершится a = " + a);
                }
//           } finally {
//               if (interrupted) {
//                   currentT.interrupt();
//               }
//           }
            while (!currentT.isInterrupted()) {
                try {
                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e) {
                }
                System.err.println("Какая-то работа = " + a);
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
