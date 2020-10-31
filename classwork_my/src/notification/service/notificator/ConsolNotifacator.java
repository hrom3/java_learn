package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class ConsolNotifacator implements INotificator {
    public boolean notify(String message) {
        System.out.println(message);
        return true;
    }
}
