package strings;


public class StringMain8 {
    public static void main(String[] args) {
        Day day = Day.THURSDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
        System.out.println("day.name()=" + day.name()); // ВСЕГДА возвращает название элемента
        System.out.println("day.toString()=" + day.toString()); // ВОЗМОЖНО возвращает название элемента
        System.out.println("day.ordinal()=" + day.ordinal()); // номер по порядку в Enum

    }
}
