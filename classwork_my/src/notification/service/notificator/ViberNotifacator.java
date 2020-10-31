package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class ViberNotifacator implements INotificator {
    public boolean notify(String message) {
        System.out.println("Отправляю элктронное письмо" + message);
        return true;
    }
}
