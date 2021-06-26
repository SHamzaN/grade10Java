package ghar.javawork.virtual.unit5.part1notes;
import java.util.Scanner;

public class Constructors101Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Because this has no parameters it calls the unseen default constructor
        //	Constructors101 con = new Constructors101(); // Default constructor call (no parameters)

        System.out.print("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scan.nextInt();

        /* Because this class constructor call has parameters, java knows to call
         * the constructor we created and not the default constructor that does
         * not have any parameters. */
        Constructors101 con = new Constructors101(number1, number2);

        con.outputValues();

    }
}
