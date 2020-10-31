package notification.service.notificator.core;

import notification.service.notificator.EmailNotifacator;
import notification.service.notificator.ConsolNotifacator;
import notification.service.notificator.ViberNotifacator;


public enum TypeNotify implements INotificator {
    VIBER(new ViberNotifacator()),
    E_MAIL(new EmailNotifacator()),
    CONSOLE(new ConsolNotifacator());

    private final INotificator notificator;

    TypeNotify(INotificator notificator) {
        this.notificator = notificator;
    }

    public boolean notify(String message) {
        return this.notificator.notify(message);
    }
}
