package utils;

import java.util.Random;

public class RandomMy1 {
    final static private char[] allString = ("AZSXDCFVGBHNJMKLQWERTYUIOP" +
            "qazwsxedcrfvtgbyhnujmiklop" +
            "ЯФЙЧЫЦСВУМАКИПЕТРНЬОГБЛШЮДЩЖЗХЭЪЁё" +
            "яфйчыцсвумакипетрньогблшюдщжзхъэ").toCharArray();


    public static String randomNextString(int length) {
        StringBuilder b = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            b.append(allString[((int) (Math.random() * allString.length) - 1)]);
        }
        return  b.toString();
    }
}
