package classworkmy.generic;

import java.util.Arrays;
import java.util.Comparator;

public class DataContaner<T> {
    private T[] data;

    public DataContaner(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        for (int i = 0; i < data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        return -1;
    }

    public void bubbleSorter(Comparator<T> comparator) {
        for (int i = 0; i < this.data.length; i++) {
            for (int j = this.data.length - 1; j > i; j--) {
               if (comparator.compare(this.data[j],this.data[j - 1]) > 0) {
                    T temp = this.data[j - 1];
                    this.data[j - 1] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }
    public static <V extends Comparable> void sort (DataContaner<V> contaner) {
        for (int i = 0; i < contaner.data.length; i++) {
            for (int j = contaner.data.length - 1; j > i; j--) {
                if (contaner.data[j].compareTo(contaner.data[j - 1]) > 0) {
                    V temp = contaner.data[j - 1];
                    contaner.data[j - 1] = contaner.data[j];
                    contaner.data[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Data = "
                 + Arrays.toString(data);
    }
}
