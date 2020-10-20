package multithread;

import multithread.core.MyJobRepeatable;
import multithread.core.MyJobRepeatableNotInfinity;
import multithread.core.ThredUtils;

public class Main4 {
    public static void main(String[] args) {
        ThredUtils.printAboutCurrentTred();
        Thread th1 = new Thread(new MyJobRepeatableNotInfinity());

//        th1.setDaemon(true);
        th1.start();
        try {
            th1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Main Thread finish");
        System.out.println();
    }
}
