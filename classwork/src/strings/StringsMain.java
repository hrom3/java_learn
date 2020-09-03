package strings;

import java.util.Objects;

public class StringsMain {
    public static void main(String[] args) {
        String str = "Я изучаю Java и английский тоже надо";
        String str2 = "Я изучаю Java и английский тоже надо";
        String str1 = new String("Я изучаю Java и английский тоже надо");

        System.out.println(str == str2);
        System.out.println(str1 == str2);
//        System.out.println(Objects.equals(str, str2));
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));


    }
}
