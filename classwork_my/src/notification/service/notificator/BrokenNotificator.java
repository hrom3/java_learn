package notification.service.notificator;

import notification.service.notificator.core.INotificator;

public class BrokenNotificator implements INotificator {

        // комментарий 1
//    private volatile static BrokenNotificator instance; // volotile важно для мнгопоточки
    private volatile static BrokenNotificator instance =  new BrokenNotificator();

    private BrokenNotificator() {

    }

    public static BrokenNotificator getInstance() {
        // закоментрованный код смотри комментарий 1
//        if (instance == null) {
//            synchronized (BrokenNotificator.class) {
//                if (instance == null) {
//                    instance = new BrokenNotificator();
//                }
//            }
//        }
        return instance;
    }

    @Override
    public boolean notify(String message) {
        System.out.println("Поломан");
        return false;
    }
}
