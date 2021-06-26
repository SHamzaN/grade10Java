package ghar.javawork.virtual.unit4.part2;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        LineSlope output = new LineSlope();
        System.out.print("Enter x1: ");
        int x1 = s.nextInt();
        System.out.print("Enter y1: ");
        int y1 = s.nextInt();
        System.out.print("Enter x2: ");
        int x2 = s.nextInt();
        System.out.print("Enter y2: ");
        int y2 = s.nextInt();
        System.out.println("Void Method: ");

        output.slopeV(x1,y1,x2,y2);

        System.out.print("\n");
        System.out.println("Return Method: ");
        System.out.println("The slope is " + output.slopeR( x1, y1, x2, y2));
    }
}
