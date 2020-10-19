package generic;

import oop.MainNameComparator;
import oop.Man;

public class GenericMain5 {
    public static void main(String[] args) {
        Man man1 = new  Man("Sasha", 123);
        Man man2 = new  Man("SashA", 12);

        System.out.println(man1.compareTo(man2));
        System.out.println(man2.compareTo(man1));

        MainNameComparator mainNameComparator = new MainNameComparator();
        System.out.println(mainNameComparator.compare(man1,man2));
        System.out.println(man1.getName().compareTo(man2.getName()));
    }
}
