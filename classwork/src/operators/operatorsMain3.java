package operators;

public class operatorsMain3 {
    public static void main(String[] args) {
        int dayNumber = 3;
        switch (dayNumber){
//            default:
//                System.out.println("bad"); it's bad
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("bad");
        }
    }
}
