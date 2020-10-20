package multithread.core;

public class ThredUtils {
    public static void printAboutCurrentTred() {
        Thread currentThred = Thread.currentThread();
        System.out.println("Id = " + currentThred.getId());
        System.out.println("Name = " + currentThred.getName());
        System.out.println("ThreadGroup = " + currentThred.getThreadGroup());
        System.out.println("Priority = " + currentThred.getPriority());
        System.out.println("State = " + currentThred.getState());
        System.out.println("Alive = " + currentThred.isAlive());
        System.out.println("Daemon = " + currentThred.isDaemon());

        System.out.println("/_______________/");



    }
}
