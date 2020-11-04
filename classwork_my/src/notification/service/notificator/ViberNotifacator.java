package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class ViberNotifacator implements INotificator {

    private volatile static ViberNotifacator instance;


    private ViberNotifacator() {

    }

    public static ViberNotifacator getInstance() {
        if (instance == null) {
            synchronized (ViberNotifacator.class) {
                if (instance == null) {
                    instance = new ViberNotifacator();
                }
            }
        }
        return instance;
    }


    public boolean notify(String message) {
        System.out.println("Отправляю элктронное письмо. " + message);
        return true;
    }
}
