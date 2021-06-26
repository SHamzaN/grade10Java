package ghar.javawork.virtual.unit5.part1notes;

import java.util.Scanner;

public class Constructors104Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scan.nextInt();

        System.out.println("\n");

        System.out.println("Calling Constructors104(number1,number2)");
        Constructors104 con1 = new  Constructors104(number1,number2);
        con1.outputValues();
        System.out.println("\n");

		/*System.out.println("Calling Default Constructors104()");
		Constructors104 con2 = new  Constructors104(); // Default constructors have no parameters
		con2.outputValues();
		System.out.println("\n");*/

		/*System.out.println("Calling Constructors104(number1)");
		Constructors104 con3 = new  Constructors104(number1);
		con3.outputValues();
		System.out.println("\n");*/


    }
}
