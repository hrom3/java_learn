package classworkmy.generic;

import classworkmy.generic.dto.BoxObject;

public class GenerikMain2 {
    public static void main(String[] args) {
        BoxObject box1  = new BoxObject();

        box1.setItem("beda");
        String item1 = (String) box1.getItem();

        System.out.println(item1);

        box1.setItem(123);

        int item2 = (int) box1.getItem();

        System.out.println(item2);



    }
}
