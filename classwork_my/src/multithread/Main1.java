package multithread;

import multithread.core.MyThred;
import multithread.core.ThredUtils;

public class Main1 {
    public static void main(String[] args) {
        ThredUtils.printAboutCurrentTred();
        Thread th1 = new MyThred();
        th1.start();
    }
}
