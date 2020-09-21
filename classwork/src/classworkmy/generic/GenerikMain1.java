package classworkmy.generic;

import classworkmy.generic.dto.BoxObject;
import oop.calculator.CalcMain1;

public class GenerikMain1 {
    public static void main(String[] args) {
        BoxObject box1  = new BoxObject();

        box1.setItem("beda");
        box1.setItem(123);
        box1.setItem(new CalcMain1());


        System.out.println(box1);
    }
}
