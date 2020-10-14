package exceptoins.my_exeption;

import java.util.List;

public class AggregatedException extends RuntimeException {

    private List<String> messages;

    public AggregatedException() {
        super();
    }
    public AggregatedException(List<String> messages) {
        super(messages);
    }

    public AggregatedException(String message) {
        super(message);
    }

    public AggregatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AggregatedException(Throwable cause) {
        super(cause);
    }

    public AggregatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public List<String> getMessages() {
        return messages;
    }
}
