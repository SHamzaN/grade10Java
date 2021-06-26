package ghar.javawork.virtual.unit4.part2notes;

import java.util.Scanner;

public class Methods101Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Methods101 m = new Methods101();

        System.out.print("Enter a number (0-6): ");
        int weekday = scan.nextInt();

        System.out.println("Day of the week: " + m.weekdayName(weekday));
    }
}
