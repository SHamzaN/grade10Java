package ghar.javawork.virtual.unit5.part1;
import java.util.Scanner;

public class Runner  //this class is used to test Triangle
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        //ask for user input
        System.out.print("Enter side A ::  ");
        int a = keyboard.nextInt();

        System.out.print("Enter side B ::  ");
        int b = keyboard.nextInt();

        System.out.print("Enter side C ::  ");
        int c = keyboard.nextInt();


        Triangle test = new Triangle(a, b, c);
        test.calcPerimeter();
        test.calcArea();
        test.print();

    }
}
