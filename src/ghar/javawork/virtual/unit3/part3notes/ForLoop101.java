package ghar.javawork.virtual.unit3.part3notes;

import java.util.Scanner;
public class ForLoop101
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        // 1. Start (loop control variable)
        // 2. End (Boolean Conditional, this statement must be true for the loop to run)
        // 3. Increment (what the loop control variable [lcv] goes up/down by)

        for(int i = 5; i <= 20; i++) // DO NOT PUT SEMICOLON AT THE END OF A FOR LOOP!!
            System.out.print(i+" ");

        System.out.println("\n");

        for(int i = 2; i <= 20; i+=2)
            //  start;  end;    increment
            System.out.print(i+" ");

        System.out.println("\n");

        for(int lcv = 10; lcv >= 1; lcv--)
            System.out.print(lcv + " ");

        System.out.println("\n");



        //Infinite loop

        // for(int lcv = 1; lcv >= 0; lcv++)
        // System.out.println(lcv);

    }
}