package generic;

import oop.Man;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;


public class GenericMain2 {
    public static void main(String[] args) {
        Collection<Man> data = new ArrayList<>();
        int count = 10_000;

        job(data, Generator::generateMan, count);
    }

    private static <T> void job(Collection<T> data, Supplier<T> supplier, int count) {
        Generator.generator(data,supplier, count);
        Iterator<T> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
