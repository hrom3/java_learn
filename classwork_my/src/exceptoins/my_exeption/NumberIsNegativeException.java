package exceptoins.my_exeption;

public class NumberIsNegativeException extends IllegalArgumentException  {
    public NumberIsNegativeException() {
        super("Число негативное");
    }

    public NumberIsNegativeException(String s) {
        super(s);
    }

    public NumberIsNegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberIsNegativeException(Throwable cause) {
        super(cause);
    }
}
