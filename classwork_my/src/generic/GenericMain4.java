package generic;

import generic.dto.BoxNumber;

public class GenericMain4 {
    public static void main(String[] args) {
        BoxNumber<Double> box1 = new BoxNumber<>();
        BoxNumber<Integer> box2 = new BoxNumber<>();
        BoxNumber<Long> box3 = new BoxNumber<>();
        BoxNumber<Number> box4 = new BoxNumber<>();

        box1.setNumber(123.);

        System.out.println(box1.getNumber());

        box2.setNumber(123);
        box3.setNumber(123l);

        Number item = box4.getNumber();
        Number item1 = box3.getNumber();
    }
}
