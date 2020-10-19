package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(1252);
        list.add(100);
        list.add(99);
        list.add(100);

        System.out.println(list);

        Integer oldValue = list.set(0,100);
        System.out.println(oldValue);
        System.out.println(list);
//        list.remove(100);
        list.remove(Integer.valueOf(15));
        list.remove(1);
        System.out.println(list);

        int index1 = list.indexOf(100);
        int index2 = list.lastIndexOf(100);
        int indexlast = 0;
        int count = 0;
        if (index1 != index2) {
            count = 2;
            for (int i = index1; i < index2; i++) {
                if (list.get(i) == 100) {
                    indexlast = i;
                    count++;
                }
            }
        }
        System.out.println(indexlast + " " + count);


    }
}
