public class SecondsInDay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingHours = 24 - currentHours;
        int remainingMinutes = remainingHours * 60 - currentMinutes;
        int remainingSeconds = remainingMinutes * 60 - currentSeconds;

        System.out.println ("There are " + remainingSeconds + " seconds left.");




    }
}
