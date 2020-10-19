package generic;

import java.util.Comparator;

public class SortMain {
    public static void main(String[] args) {
        SortComparator comparator = new SortComparator();
        DataContaner<Integer> cont = new DataContaner(new Integer[5]);
        DataContaner<String> cont1 = new DataContaner(new String[5]);
        cont.add(3);
        cont.add(58);
        cont.add(585);
        cont.add(24);
        cont.add(2);
        System.out.println(cont.toString());
        cont.bubbleSorter((Comparator<Integer>) comparator);
        System.out.println(cont.toString());
        DataContaner.sort(cont);
    }
}
