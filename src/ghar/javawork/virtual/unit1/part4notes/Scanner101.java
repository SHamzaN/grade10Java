package ghar.javawork.virtual.unit1.part4notes;

import java.util.Scanner; //Must import this package to use the Scanner

public class Scanner101
{
    public static void main(String[] args)
    {
        Scanner batman = new Scanner(System.in); //This line "creates" the Scanner

        //  System.out.print("Please enter an integer: "); //This is only the user prompt. It is NOT interactive.
        //batman.nextInt(); //uses scanner but does not store value
        // int num1 = batman.nextInt(); //This line stops the program and waits for the user to input an integer and then stores the input into the variable num1

        //Backwards
        int num1 = batman.nextInt();
        System.out.print("Please enter an integer: ");

        System.out.println("The number you entered is: " + num1);

        System.out.print("\nPlease enter a real number: " );
        double num2 = batman.nextDouble();


        System.out.println("The number you entered is: " + num2);

    }
}