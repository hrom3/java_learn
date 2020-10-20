package io;

import generics.dto.BoxObject;

import java.io.*;
import java.util.Date;

public class IOMAin6 implements Serializable {
    public static void main(String[] args) {
        try(FileInputStream fileInPut = new FileInputStream("classwork_my"
                + File.separator + "src" + File.separator +"io"
                + File.separator +"t.tmp");
            ObjectInputStream ois = new ObjectInputStream(fileInPut)) {
            int i = ois.readInt();
           String today = (String) ois.readObject();
           Date date = (Date) ois.readObject();
            BoxObject boxObject = (BoxObject) ois.readObject();

            System.out.println(i);
            System.out.println(today);
            System.out.println(date);
            System.out.println(boxObject);
            System.out.println(boxObject.getItem());

        } catch (FileNotFoundException e) {
            System.out.println("Что-то не так с файлом " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то совсем плохо " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
