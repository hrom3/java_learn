package exceptoins;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            selfCall();
        } catch (StackOverflowError e) {

        }
    }

    public static void selfCall() {
                selfCall();
            }
}
