package classworkmy.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOAddMain4 {
    public static void main(String[] args) {
        String path =  "classwork_my" + File.separator + "src" + File.separator +"io"
                + File.separator +"file.txt";
        File file = new File(path);
        file.exists();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                writer.write("1");
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
