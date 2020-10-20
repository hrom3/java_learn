package multithread;

import multithread.core.MyJob;
import multithread.core.MyJobRepeatable;
import multithread.core.ThredUtils;

public class Main3 {
    public static void main(String[] args) {
        ThredUtils.printAboutCurrentTred();
        Thread th1 = new Thread(new MyJobRepeatable());

        th1.setDaemon(true);
        th1.start();
//        th1.setDaemon(true);
    }
}
