package multithread.core;

public class MyJob implements Runnable {
    @Override
    public void run() {
        ThredUtils.printAboutCurrentTred();
//        System.out.println("456");
    }
}
