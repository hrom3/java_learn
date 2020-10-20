package multithread;

import multithread.core.MyJob;
import multithread.core.MyThred;
import multithread.core.ThredUtils;

public class Main2 {
    public static void main(String[] args) {
        ThredUtils.printAboutCurrentTred();
        Thread th1 = new Thread(new MyJob());
        th1.start();
    }
}
