package ghar.javawork.virtual.unit8;

import java.util.Scanner;
public class TriangleLetter4
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rows = scan.nextInt();
        System.out.print("Enter a letter: ");
        char c = scan.next().charAt(0);
        System.out.println("");

        for(int i=rows;i>0;i--)
        {
            for(int j=rows-i;j>0;j--)

            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}