package ghar.javawork.virtual.unit2.part1;
import java.util.Scanner;
public class Pythagorean
{
    public static void main(String[] args)
    {
        // Start here!
        int a = 0;
        int b = 0;
        double c = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter side A: ");   // prompt
        //a = keyboard.nextInt();                 // read a's length
        System.out.print("Enter side B: ");   // prompt
        a = keyboard.nextInt();
        //System.out.println("\n");
        b = keyboard.nextInt();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //  System.out.println();
        System.out.println("The length of hypotenuse C: "+ (double) (Math.round(c)));

    }
}