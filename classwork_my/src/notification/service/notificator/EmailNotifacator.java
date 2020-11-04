package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class EmailNotifacator implements INotificator {

    private volatile static EmailNotifacator instance;


    private EmailNotifacator() {

    }

    public static EmailNotifacator getInstance() {
        if (instance == null) {
            synchronized (EmailNotifacator.class) {
                if (instance == null) {
                    instance = new EmailNotifacator();
                }
            }
        }
        return instance;
    }

    public boolean notify(String message) {
        System.out.println("Отправляю сообщение в Viber. " + message);
        return true;
    }
}
