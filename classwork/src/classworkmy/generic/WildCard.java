package classworkmy.generic;

import classworkmy.generic.dto.BoxNumber;

import javax.swing.*;

public class WildCard {
    public static void main(String[] args) {
       BoxNumber box1 = new BoxNumber();
        BoxNumber<Integer> box2 = new BoxNumber<>();
        BoxNumber<Double> box3 = new BoxNumber<>();
        BoxNumber<Number> box4 = new BoxNumber<>();

        print(box1);
        print(box2);
        print(box3);
        print(box4);

        printInt(box1);
        printInt(box2);
//        printInt(box3);
//        printInt(box4);

        printDouble(box1);
//        printDouble(box2);
        printDouble(box3);
        printDouble(box4);

    }

    public static void print(BoxNumber<?> box) {
        System.out.println(box);
    }

    public static void printInt(BoxNumber<? extends Integer> box) {
        System.out.println(box);
    }

    public static void printDouble(BoxNumber<? super Double> box) {
        System.out.println(box);
    }
}
