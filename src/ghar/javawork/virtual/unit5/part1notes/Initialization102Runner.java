package ghar.javawork.virtual.unit5.part1notes;

import java.util.Scanner;

public class Initialization102Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        Initialization102 init = new Initialization102(number1, number2);

        System.out.println("num1: " + init.num1);// Directly accessing the instance variables in the class Initialization102
        System.out.println("num2: " + init.num2);// This is a bad thing!!!

    }
}