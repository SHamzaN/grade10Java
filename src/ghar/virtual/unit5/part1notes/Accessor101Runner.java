package ghar.javawork.virtual.unit5.part1notes;

import java.util.Scanner;

public class Accessor101Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        Accessor101 acc = new Accessor101(number1, number2);

        System.out.println("num1: " + acc.getNum1());
        System.out.println("num2: " + acc.getNum2());

        double value = Math.sqrt(acc.getNum1());
        System.out.println(value);


    }
}
