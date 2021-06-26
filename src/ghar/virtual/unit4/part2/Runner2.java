package ghar.javawork.virtual.unit4.part2;

import java.util.Scanner;
public class Runner2
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        Temp output = new Temp();
        System.out.println("Enter temp in farenheit: ");
        double num = s.nextDouble();
        //  System.out.println("\n");
        System.out.print("Void Method:");
        output.tempV(num);

        System.out.println("\n");
        System.out.println("Return Method: ");
        System.out.println("The temp in Celsius is " + output.tempR(num));
    }
}