package generic;

import generic.dto.BoxGeneric;
import generic.dto.BoxGenericTwo;

public class GenericMain3 {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<>();
        // для совместимсти с версиями ранее 7 надо писать new BoxGeneric<String>()

        box1.setItem("Привет Саня!");

        System.out.println(box1.getItem());

        BoxGeneric<Integer> box2 = new BoxGeneric<>();

        box2.setItem(123);

        BoxGenericTwo<String, Integer> box3 = new BoxGenericTwo<>();

        box3.setItem("Привет Саня!");
        box3.setItem(123);

        Object item = box3.getItem();
        String item1 = box3.getItem();
        int item2 = box3.getItemTwo();

    }
}
