package ghar.javawork.virtual.unit4.part1notes;

import java.util.Scanner;

public class Calc101Runner
{
    public static void main(String[] args)
    {
        Scanner supergirl = new Scanner(System.in);//Instantiate an object of Scanner class using a constructor.
        //  Class   object name

        Calc101 math = new Calc101();//Instantiate an object of Calc101 class using a constructor.
        //  Class   object name

        //Cheese math2 = new Cheese(); You can only instantiate objects of classes that actually exist

        System.out.print("Enter the first number: ");
        double num1 = supergirl.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = supergirl.nextDouble();

        /**NOTE: Have student make first method, then run program w/o method call*/

        System.out.println("\nVoid Methods::");// Void method calls stand alone.
        // Void Method Calls
        math.addV(num1,num2); // num1 and num2 in the method call are called "actual parameters".
        math.subV(num1,num2);
        // Call methods mulV and divV
        math.mulV(num1,num2);
        math.divV(num1,num2);


        System.out.println("\nReturn Methods::");// Return method calls need to be a part of another operation or command
        System.out.println(num1 + " + " + num2 + " = " + math.addR(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + math.subR(num1,num2));
        //Call methods mulR and divR
        System.out.println(num1 + " * " + num2 + " = " + math.mulR(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + math.divR(num1,num2));

    }
}