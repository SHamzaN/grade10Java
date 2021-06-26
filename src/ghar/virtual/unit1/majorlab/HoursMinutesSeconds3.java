package ghar.javawork.virtual.unit1.majorlab;
import java.util.Scanner;
public class HoursMinutesSeconds3
{
    public static void main(String[] args)
    {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        int MILLISECONDS_IN_HOUR = 3600000;
        int   MILLISECONDS_IN_MINUTE = 60000;
        int MILLISECONDS_IN_SECOND = 1000;
        Scanner starts = new Scanner(System.in);

        System.out.println("Enter starting milliseconds: ");
        int secscan = starts.nextInt();

        int startingmili = 10000123;
        int start_seconds = 10000;
        // from 80's ends here

        int hours = start_seconds / SECONDS_IN_HOUR;
        int remaining_seconds = start_seconds % SECONDS_IN_HOUR;
        int minutes = remaining_seconds / SECONDS_IN_MINUTE;
        int sec = remaining_seconds % SECONDS_IN_MINUTE;
        int mili = startingmili %  MILLISECONDS_IN_SECOND;

        System.out.println("Starting milliseconds: " + startingmili);
        System.out.println("Hours: " + hours );
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + sec);
        System.out.println("Milliseconds: " + mili);




    }
}