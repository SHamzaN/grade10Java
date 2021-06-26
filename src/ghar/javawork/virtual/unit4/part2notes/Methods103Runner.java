package ghar.javawork.virtual.unit4.part2notes;

import java.util.Scanner;

public class Methods103Runner
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        Methods103 m = new Methods103();

        System.out.println("Average Three Numbers!");
        System.out.print("Enter a first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter a third number: ");
        int num3 = scan.nextInt();

        //Can't call private methods from outside their class
        //	System.out.println("The sum of the three numbers is: " + m.sumThree(num1,num2,num3));

        System.out.println("The average of the three numbers is: " + m.averageThree(num1,num2,num3));

    }
}
