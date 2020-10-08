package classworkmy.collections;

import oop.Man;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LstMain5 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 0; i < 1001; i++) {
            data.add(i);
        }

        System.out.println(data);

        Iterator<Integer> iterator = data.iterator();
            //BAD
//        int i = -1;
//        while (iterator.hasNext()) {
//           i++;
//            Integer next = iterator.next();
//            if (next %2 == 0) {
//                data.remove(i);
//            }
//         }
            // GOOD
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next %2 == 0) {
//                iterator.remove();
//            }
//        }
//        int i = -1;
//        for (Integer datum : data) {
//            i++;
//            if (datum % 2 == 0) {
//                data.remove(i);
//            }
//        }
//
//        Man man = new Man(); надо имплементировать метод Iterable
//
//        for (Man b : man) {
//
//       }
        System.out.println(data);

    }
}
