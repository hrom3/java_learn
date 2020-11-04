package notification.service.notificator;

import notification.service.notificator.ConsolNotifacator;
import notification.service.notificator.core.INotificator;
import notification.service.notificator.core.TypeNotify;
import notification.service.notificator.special.MultipleNotificator;
import notification.service.notificator.special.ResendNotificator;
import notification.service.notificator.special.RetryNotifcator;


public class NotificationMain1 {
    public static void main(String[] args) {
        String orderId = "10";
        String message = "Приехал новый заказ. Номер заказа: " + orderId;
        String managerName = "Саша";
        boolean isBadNotification = false;

        if (managerName.equalsIgnoreCase("Саша")) {
            notify(RetryNotifcator.getInstance(5, new ResendNotificator(BrokenNotificator.getInstance(), ViberNotifacator.getInstance())), message);

        } else {
            notify(RetryNotifcator.getInstance(5, new ResendNotificator(ViberNotifacator.getInstance())), message);
        }
 //       if (isBadNotification) { //вариант 2
 //           notify(new ConsolNotifacator(), message);
 //       }

        TypeNotify[] typeNotifies = TypeNotify.values();
            notify(new MultipleNotificator(typeNotifies), "Ваш заказ принят в обработку");
    }

    public static boolean notify(INotificator notificator, String message) {
        return notificator.notify(message);
    }



}
