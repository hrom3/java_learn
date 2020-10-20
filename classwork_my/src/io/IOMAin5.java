package io;

import generics.SomeComparator;
import generics.dto.BoxObject;

import java.io.*;
import java.util.Date;

public class IOMAin5 implements Serializable {
    public static void main(String[] args) {
        try(FileOutputStream fileOutPut = new FileOutputStream("classwork_my"
                + File.separator + "src" + File.separator +"io"
                + File.separator +"t.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutPut)) {
            oos.writeInt(12345);
            oos.writeObject("Today");
            oos.writeObject(new Date());
            BoxObject boxObject = new BoxObject();
            boxObject.setItem(new SomeComparator());
            oos.writeObject(boxObject);
        } catch (FileNotFoundException e) {
            System.out.println("Что-то не так с файлом " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то совсем плохо " + e.getMessage());
            throw new RuntimeException(e);
        }




    }
}
