package multithread.core;

public class MyThred extends Thread {

    public MyThred() {
    }

    public MyThred (Runnable target) {
        super(target);
    }

    @Override
    public void run() {
       ThredUtils.printAboutCurrentTred();
        System.out.println("123");
    }
}
