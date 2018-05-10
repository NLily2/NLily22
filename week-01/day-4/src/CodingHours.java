public class CodingHours {
    public static void main(String[] args) {
        float HoursDaily = 6;
        float Weeks = 17;
        float Weekdays = Weeks * 5;
        float HoursWeek = 52;

        float HoursSemester = Weekdays * HoursDaily;
        float Percentage = HoursWeek / HoursSemester * 100;

        System.out.println("An average attendee codes " + HoursSemester + " hours in a semester.");
        System.out.println("The percentage of the coding hours is: " + Percentage);

    }
}

