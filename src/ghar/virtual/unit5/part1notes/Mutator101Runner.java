package ghar.javawork.virtual.unit5.part1notes;

import java.util.Scanner;

public class Mutator101Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        Mutator101 mu = new Mutator101(number1, number2);

        System.out.println("num1: " + mu.getNum1());
        System.out.println("num2: " + mu.getNum2());

        mu.setNum1(3);
        mu.setNum2(7);

        System.out.println("num1: " + mu.getNum1());
        System.out.println("num2: " + mu.getNum2());

    }
}
