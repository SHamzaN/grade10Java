package ghar.javawork.virtual.unit1.majorlab;

public class HoursMinutesSeconds
{
    public static void main(String[] args)
    {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;

        final int start = 10000;
        int  hours = start / SECONDS_IN_HOUR;
        int remaining_seconds = start % SECONDS_IN_HOUR;
        int minutes = remaining_seconds / SECONDS_IN_MINUTE;
        int sec = remaining_seconds % SECONDS_IN_MINUTE;

        System.out.println("Starting seconds: " + start);
        System.out.println("Hours: " + hours );
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + sec);

    }
}