package test;

public class Test3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().interrupted());// изменение состояния флага
                }
            }
        }).start();
    }

}
