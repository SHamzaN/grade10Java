package ghar.javawork.virtual.unit3.part1;

import java.util.Scanner;

public class DistanceFormula {

    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);

        System.out.print("Enter truck A's X coordinate :: ");
        int  cord = s.nextInt();

        System.out.print("Enter truck A's Y coordinate :: ");
        int  cord1 = s.nextInt();
        System.out.print("Enter truck B's X coordinate :: ");
        int cord2 = s.nextInt();
        System.out.print("Enter truck B's Y coordinate :: ");
        int cord3 = s.nextInt();


        String word = ("A is closer to (0,0)");

        int one = (int) Math.pow(cord2 - 0, 2);
        int one2 = (int) Math.pow(cord3 - 0, 2);
        int distance = (int)Math.sqrt((one) + (one2));

        int one3 = (int) Math.pow(cord - 0, 2);
        int one4 = (int) Math.pow(cord3 - 0, 2);
        int distance2 = (int) Math.sqrt((one3) + (one4));


        if(distance2 > distance){
            word = ("B is closer to (0,0)");
        }
        System.out.println();
        System.out.println(word);
        // distance = Math.sqrt ( ( x2 - x1 )2 + ( y2 - y1 )2 );

    }
}