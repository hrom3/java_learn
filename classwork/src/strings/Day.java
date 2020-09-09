package strings;

public enum Day {
    MONDAY(  "Понедельник", true),
    TUESDAY("Вторник", true),
    WEDNESDAY("Среда", true),
    THURSDAY("Четверг", true),
    FRIDAY( "Пятница", true),
    SATURDAY("Суббота", false),
    unknown("Суббота", false),
    SUNDAY("Воскресенье", false);

    private boolean workDay;
    private String rusName;

    Day(String rus, boolean isWorkDay) {
        this.rusName = rus;
        this.workDay = isWorkDay;
    }

    public String getRusName() {
        return this.rusName;
    }

    public boolean getIsWorkDay() {
        return this.workDay;
    }

    public static Day valueOfIgnoreCase(String dayName) {
        String dayNameUpper = dayName.toUpperCase();
        for (Day value: values()) {
            if (value.name().toUpperCase().equals(dayNameUpper)) {
                return value;
            }
        }
        return unknown;
    }

}
