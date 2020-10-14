package classworkmy.io;

import java.io.*;

public class IOMain2 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            String path =  "classwork_my" + File.separator + "src" + File.separator +"file.txt";
            writer = new BufferedWriter(new FileWriter(path));
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
        } finally {
            if (writer != null) {
               try {
                  writer.close();
               } catch (IOException ee) {
                    System.out.println("Вообще кирдец");
                }
           }
        }

    }
}
