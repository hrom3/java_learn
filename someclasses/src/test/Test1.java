package test;

public class Test1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (1 == 1) {
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        }).start();
    }

}
