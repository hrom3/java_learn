package collections;

import generic.BadComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain1 {
    public static void main(String[] args) {

    Set<String> data1 = new TreeSet<>(new BadComparator());
    Set<String> set2 = new HashSet<>();

    data1.add("a");
    data1.add("r");
    data1.add("u");

    set2.add("u");
    set2.add("r");
    set2.add("a");

    System.out.println(data1);
    System.out.println(set2);
    }
}
