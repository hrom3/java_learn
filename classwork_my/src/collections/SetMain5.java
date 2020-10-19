package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain5 {
    public static void main (String[ ] args) {
        Set<String> ere = new LinkedHashSet<>();
        boolean arr1 = ere.add("привет");
        boolean arr2 = ere.add("пака");
        boolean arr3 = ere.add("привет");

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(ere);





    }
}
