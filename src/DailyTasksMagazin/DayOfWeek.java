package DailyTasksMagazin;

public enum DayOfWeek {
    MONDAY("Lu", false),
    TUESDAY("Tues", false),
    WEDNESDAY("Wednes", false),
    THURSDAY("Thurs", false),
    FRIDAY("Fri", false),
    SATURDAY("Sat", false),
    SUNDAY("Sun", false);

    private String prescurtare;
    private boolean isWeekend;
// Constructor
    DayOfWeek(String prescurtare, boolean isWeekend) {
    }

    // Getteri
    public String getPrescurtare() {
        return prescurtare;
    }

    public boolean isWeekend() {
        return isWeekend;
    }




}

