package ghar.javawork.virtual.unit1.majorlab;

import java.util.Scanner;
public class HoursMinutesSeconds2
{
    // PASTE CODE FROM 80 POINT VERSION


    public static void main(String[] args)
    {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        Scanner starts = new Scanner(System.in);

        System.out.println("Enter starting seconds: ");
        int secscan = starts.nextInt();

        //  System.out.println(" Here is your starting seconds");

        // int second = starts.nextInt();
        int start = 10000;

        int  hours = start / SECONDS_IN_HOUR;
        int remaining_seconds = start % SECONDS_IN_HOUR;
        int minutes = remaining_seconds / SECONDS_IN_MINUTE;
        int sec = remaining_seconds % SECONDS_IN_MINUTE;
        //int hour = ;

        System.out.println("Starting seconds: " + start);

        System.out.println("Hours: " + hours );
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + sec);



    }
}