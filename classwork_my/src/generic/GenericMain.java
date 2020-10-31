package generic;

import oop.Man;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class GenericMain {
    public static void main(String[] args) {
        Collection<Man> data = new ArrayList<>();

        Generator.generator(data,
                Generator::generateMan, 10000); // :: ссылка на метод

        job(data);

    }

    private static <T> void job(Collection<T> data) {
        Iterator<T> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
