package cycles;

import java.util.Scanner;

public class StringsMain3 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String cat = "Кошка";
        for (int i = 0; i < 10; i++) {
            String catFromConsole = str.nextLine();
            System.out.println(cat == catFromConsole);
            catFromConsole.intern(); // поместили строку в string pull
            System.out.println(cat == catFromConsole);
            catFromConsole = catFromConsole.intern(); // поместили строку в string pull и поменяли ссылку на новый объект
            System.out.println(cat == catFromConsole);
            System.out.println(String.format("ПРЕМВЕТ %s Я ТЕБЯ ТАК ДЛОГО ЖДАЛ", "САНЯ"));
        }

    }
}
