package notification.service.notificator.special;

import notification.service.notificator.NullNotificator;
import notification.service.notificator.core.INotificator;

public class RetryNotifcator implements INotificator {

    private volatile static RetryNotifcator instance;
    private final int number;
    private final INotificator notificator;


    public static RetryNotifcator getInstance(int number, INotificator notificator) {
        if (instance == null) {
            synchronized (RetryNotifcator.class) {
                if (instance == null) {
                    instance = new RetryNotifcator(number, notificator);
                }
            }
        }
        return instance;
    }

    private RetryNotifcator(int number, INotificator notificator) {
        this.number = number;
        this.notificator = notificator;
    }

    @Override
    public boolean notify(String message) {
        boolean isSent = false;
        int index = 0;
        while (!isSent && index < number) {
            isSent = notificator.notify(message);
            index++;
        }
        return true;
    }
}
