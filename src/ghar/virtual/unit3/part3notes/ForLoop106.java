package ghar.javawork.virtual.unit3.part3notes;
import java.util.Scanner;

public class ForLoop106
{
    public static void main(String args[])
    {
        // accumulator

        Scanner s = new Scanner (System.in);

        // 1. Start (loop control variable) 2.End (boolean conditional, stops the loop when false) 3. Increment lcv

        System.out.print("How many grades would you like to enter: ");
        int times = s.nextInt();

        int sumOfGrades = 0; // accumulator variable

        for(int i = 0; i < times; i++)
        {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = s.nextInt();

            sumOfGrades += grade;
        }

        System.out.println("\nThe sum of the grades is: " + sumOfGrades);
    }
}