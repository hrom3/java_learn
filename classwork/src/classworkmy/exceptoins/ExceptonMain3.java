package classworkmy.exceptoins;

public class ExceptonMain3 {
    public static void main(String[] args) {
        System.out.println("Start work");
        try {
        method1();
        } catch (RuntimeException e) {
            System.out.println("Yahoo!!!!" + e);
        }

        System.out.println("Finish work");
    }

    public static void method1() {
        System.out.println("Method 1 is started");

        throw new RuntimeException("All are very bad");

//        System.out.println("Method 1 is finished");
    }
}
