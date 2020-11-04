package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class ConsolNotifacator implements INotificator {

    private volatile static ConsolNotifacator instance;


    private ConsolNotifacator() {

    }

    public static ConsolNotifacator getInstance() {
        if (instance == null) {
            synchronized (ConsolNotifacator.class) {
                if (instance == null) {
                    instance = new ConsolNotifacator();
                }
            }
        }
        return instance;
    }

    public boolean notify(String message) {
        System.out.println(message);
        return true;
    }
}
