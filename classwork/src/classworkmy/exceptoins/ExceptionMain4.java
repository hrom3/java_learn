package classworkmy.exceptoins;

import classworkmy.exceptoins.my_exeption.ArgumentNotANumber;
import classworkmy.exceptoins.my_exeption.ArrayLengthNotValidException;
import classworkmy.exceptoins.my_exeption.NumberIsNegativeException;
import homework02.CountNumeralsInNumber;

public class ExceptionMain4 {

    public static final String ARRAY_LENGTH_ERROR_MESSAGE = "Длинна не равнв 1";


    public static void main(String[] args) {
       try {
           validateArgument(args);
       } catch (ArrayLengthNotValidException | NumberIsNegativeException e ) {
           System.exit(12);
       }
       catch (IllegalArgumentException e) {
           String message = e.getMessage();
           if (message != null) {
               if (message.equalsIgnoreCase(ARRAY_LENGTH_ERROR_MESSAGE)) {}
           System.out.println(message);
           } else {
               System.out.println("Какая-то ошибка");
           }
       }
    }


     public static void validateArgument (String[] arg) {
         final CountNumeralsInNumber length = new CountNumeralsInNumber();
        if (arg.length != 1) {
            throw new ArrayLengthNotValidException(arg.length, 1);
        }
         Long number = null;
        try {
            number = Long.parseLong(arg[0]);
        } catch (NumberFormatException e) {
            throw new ArgumentNotANumber("Не число", e);
        }
         if (number == null) {
             throw new IllegalArgumentException("Это null");
         }
         if (number < 0) {
             throw new NumberIsNegativeException("Меньше ноля");
         }
         if (length.lengthOfNumber(number) > 21)
         {
//         if (arg.length > 21)
//         {
             throw new IllegalArgumentException("Слишком большое число");
         }
     }
}
