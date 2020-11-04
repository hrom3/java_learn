package notification.service.notificator.special;

import notification.service.notificator.core.INotificator;

public class MultipleNotificator implements INotificator {

    private final INotificator[] notificators;

    public MultipleNotificator(INotificator... notificators) {
        this.notificators = notificators;
    }

    @Override
    public boolean notify(String message) {
        boolean isSent = false;
        for (INotificator notificator : notificators) {
            boolean result = notificator.notify(message);
            if (result) {
                isSent = result;
            }
        }

        return isSent;
    }
}
