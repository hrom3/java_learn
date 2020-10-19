package exceptoins.my_exeption;

public class ArgumentNotANumber extends IllegalArgumentException {
    public ArgumentNotANumber() {
        super("Не число");
    }

    public ArgumentNotANumber(String s) {
        super(s);
    }

    public ArgumentNotANumber(String message, Throwable cause) {
        super(message, cause);
    }

    public ArgumentNotANumber(Throwable cause) {
        super(cause);
    }
}
