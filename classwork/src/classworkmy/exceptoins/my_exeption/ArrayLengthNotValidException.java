package classworkmy.exceptoins.my_exeption;

/**
 * Этот эксепшен выбрасится если ты сам дурак
 */

public class ArrayLengthNotValidException extends IllegalArgumentException {

    public ArrayLengthNotValidException() {
        super("Длинна массива не валидна");
    }

    public ArrayLengthNotValidException(int length) {
        super("Длинна массива "+ length +". Данная длина не валидна");
    }

    public ArrayLengthNotValidException(int currentLength, int exceptedLength) {
        super("Длинна массива "+ currentLength +". Мы ожидали " + exceptedLength);
    }

    public ArrayLengthNotValidException(String s) {
        super(s);
    }

    public ArrayLengthNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayLengthNotValidException(Throwable cause) {
        super(cause);
    }
}
