package generic;

import oop.IPhone;
import oop.Man;

import java.util.Collection;
import java.util.function.Supplier;

public class Generator {
    public static Man generateMan() {
        return new Man();
    }

    public static IPhone generateIphone() {
        return new IPhone();
    }


    public static <T> void generator(Collection<T> container, Supplier<T> supplier, int count) {
        for (int i = 0; i < count; i++) {
            container.add(supplier.get());

        }
    }
}
