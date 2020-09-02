package cycles;

public class StringMain4 {
    public static void main(String[] args) {
        System.out.println(String.format("ПРЕМВЕТ %s Я ТЕБЯ ТАК ДЛОГО ЖДАЛ", "САНЯ"));
        System.out.println(String.format("ПРЕМВЕТ %s Я ТЕБЯ ТАК ДЛОГО ЖДАЛ. МНЕ %d ЛЕТ", "САНЯ", 33));
        String name = "Alex";
        String lastName = "Ahramovich";
        String midName = null;

        System.out.println(String.format("ПРЕМВЕТ %s %s %s Я ТЕБЯ ТАК ДЛОГО ЖДАЛ. МНЕ %d ЛЕТ",
                name, lastName, midName, 33));

    }
}
