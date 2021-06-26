package ghar.javawork.virtual.unit4.part1notes;

import java.util.Scanner;

public class Calc102Runner
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); //Class constructor
        //  Class   object name

        Calc101 markymark = new Calc101(); //Class constructor
        //  Class   object name

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.println("\nVoid Methods::");// Void methods stand alone
        // Using a void method as a return method generates a compile error
        //	System.out.println(num1 + " + " + num2 + " = "+ markymark.addV(num1,num2));

        System.out.println("\nReturn Methods::");// Return methods need to be a part of another operation or command
        /* Using a return method as a void method does not cause an error but
         * goes into the nothingness and does nothing practical for the program. */
        markymark.addR(num1,num2);

    }
}