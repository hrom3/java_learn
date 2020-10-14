package classworkmy.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain3 {
    public static void main(String[] args) {
        String path =  "file.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                writer.write("1");
//                writer.flush();
                if (i == 9999) {
                    throw new IllegalArgumentException("Все плохо. Кирдык");
                }
            }
            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
