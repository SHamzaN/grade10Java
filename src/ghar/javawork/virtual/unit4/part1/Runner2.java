package ghar.javawork.virtual.unit4.part1;
import ghar.javawork.virtual.unit4.part1.Sum;

import java.util.Scanner;
public class Runner2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Sum output = new Sum();
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        System.out.println("Enter a number: ");
        int num1 = s.nextInt();
        //  System.out.println(num + num1);
        output.sumV(num,num1);

        System.out.println("Void Method::");
        //  System.out.print(num + num1 + "==");



        System.out.println("\nReturn Method::");
        System.out.print(num + " + " + num1 + " == ");
        System.out.println(output.sumR(num,num1));


    }
}
