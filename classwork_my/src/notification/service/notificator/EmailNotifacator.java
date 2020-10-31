package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class EmailNotifacator implements INotificator {
    public boolean notify(String message) {
        System.out.println("Отправляю сообщение в Viber" + message);
        return true;
    }
}
