package exceptoins;

import oop.Man;

import java.util.ArrayList;
import java.util.List;

public class ErrorMain {
    public static void main(String[] args) {
        try {
            List<Man> man = new ArrayList<>();
            while (1 == 1) {
                man.add(new Man());
            }
        } catch (OutOfMemoryError error) {
            System.exit(789);
        }
        System.out.println("We're working");
    }

}
