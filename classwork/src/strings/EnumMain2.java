package strings;

public class EnumMain2 {
       public static void main(String[] args) {
           Day day2 = Day.FRIDAY;
//        EnumMain2 obj = new EnumMain2();
//        obj.day2 = Day.FRIDAY;
        System.out.println(getRusName(day2));
    }

    public static String getRusName(Day day) {
        switch (day) {
            case MONDAY: return "Понедельник";
            case TUESDAY: return "Вторник";
            case WEDNESDAY: return "Среда";
            case THURSDAY: return "Четверг";
            case FRIDAY: return "Пятница";
            case SATURDAY: return "Суббота";
            case SUNDAY: return "Воскресенье";
            default:return "Плохой день";
        }
    }
}
