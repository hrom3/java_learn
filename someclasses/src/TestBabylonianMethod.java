public class TestBabylonianMethod {
    public static void main(String[] args) {
        double a = -.000000000000452424528;

//        if (a < 0) {
////            return NaN;
////      }
//        if (a == 0) {
//            return 0;
//        }


        int newNumberInt;
        double result;
        double newNumber = a;
        double oldResult;
        int nearNumberInSquare;
        int powOfTen = 0;
        boolean isEqual = false;
        double modNumber;

        TestBabylonianMethod mod = new TestBabylonianMethod();
        modNumber = mod.abs(a);
        newNumber = modNumber;

        if (newNumber >= 1) {
            while (newNumber >= 100){
                newNumber /= 100;
                powOfTen++;
            }
        } else {
            while (newNumber < 1) {
                newNumber *= 100;
                powOfTen--;
            }
        }
        newNumberInt =  (int) newNumber;


        if (newNumberInt < 4) {
            nearNumberInSquare = 2;
        } else if (newNumberInt < 9) {
            nearNumberInSquare = 3;
        } else if (newNumberInt < 16) {
            nearNumberInSquare = 4;
        } else if (newNumberInt < 25) {
            nearNumberInSquare = 5;
        } else if (newNumberInt < 36) {
            nearNumberInSquare = 6;
        } else if (newNumberInt < 49) {
            nearNumberInSquare = 7;
        } else if (newNumberInt < 64) {
            nearNumberInSquare = 8;
        } else {
            nearNumberInSquare = 9;
        }

        result = nearNumberInSquare * Math.pow(10, powOfTen);




        for (int i = 0; i < 10 && !isEqual; i++) {
            oldResult = result;
            result = 0.5 * (result + (modNumber / result));
            System.out.println(result);
            isEqual = oldResult == result;
        }
        result = a > 0 ? result : -result;
        System.out.println();
        System.out.println(result);
        System.out.println();
    }

    public double abs(double number) {
        return number = number >= 0 ? number : -number;
    }

}
