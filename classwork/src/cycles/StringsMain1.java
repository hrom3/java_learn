package cycles;

import java.util.Objects;

public class StringsMain1 {
    public static void main(String[] args) {
        String str = "Я изучаю Java";
        str += " и английский тоже надо";
        String str2 = "Я изучаю JAva и английский тоже надо";

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str == str2);
        System.out.println(Objects.equals(str, str2));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));


    }
}
