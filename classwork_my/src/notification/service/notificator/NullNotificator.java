package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class NullNotificator implements INotificator {

    private volatile static NullNotificator instance;


    private NullNotificator() {

    }

    public static NullNotificator getInstance() {
        if (instance == null) {
            synchronized (NullNotificator.class) {
                if (instance == null) {
                    instance = new NullNotificator();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean notify(String message) {
        return true;
    }
}
