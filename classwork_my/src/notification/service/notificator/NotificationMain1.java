package notification.service.notificator;

import notification.service.notificator.ConsolNotifacator;
import notification.service.notificator.core.INotificator;
import notification.service.notificator.core.TypeNotify;


public class NotificationMain1 {
    public static void main(String[] args) {
        String orderId = "10";
        String message = "Приехал новый заказ. Номер заказа: " + orderId;
        String managerName = "Саша";
        boolean isBadNotification = false;

        if (managerName.equalsIgnoreCase("Илья")) {
            if(!notify(new BrokenNotificator(), message)) {
                notify(new ConsolNotifacator(), message);
 //               isBadNotification = true; //вариант 2
            };
        } else {
            if(!notify(new BrokenNotificator(), message)) {
                notify(new ConsolNotifacator(), message);
//                isBadNotification = true; //вариант 2
            }
        }
 //       if (isBadNotification) { //вариант 2
 //           notify(new ConsolNotifacator(), message);
 //       }

        TypeNotify[] typeNotifies = TypeNotify.values();
        for (TypeNotify typeNotify : typeNotifies) {
            notify(typeNotify, "Ваш заказ принят в обработку");
        }

    }

    public static boolean notify(INotificator notificator, String message) {
        return notificator.notify(message);
    }



}
