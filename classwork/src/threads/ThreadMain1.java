package threads;

import threads.core.MyThread;
import threads.core.ThreadUtils;

public class ThreadMain1 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();
        Thread th1 = new MyThread();
        th1.start();
    }
}
