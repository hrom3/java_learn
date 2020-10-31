package test;

public class Test5 {
    static long a = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 100L; i++) {
                a += 1;
                System.err.println("setter a = " + a);
            }
        });

        Thread t2 = new Thread(() -> {
            while (!Thread.interrupted()) { //ref.1 проверка на прерывание и сброс флага прерывания на false
                System.err.println("monitoring a = " + a); //  цикл выполняется до прихода команды на прерывание
            }
            while (!Thread.interrupted()) { // бесконечный цикл из-за сброса флага см. ref.1
//            while (Thread.interrupted()) {  // при данном условии в цикл не зайдем, выполнение остановится
                System.err.println("monitoring \ta = " + a);
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
