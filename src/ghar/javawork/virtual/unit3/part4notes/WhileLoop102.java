package ghar.javawork.virtual.unit3.part4notes;

import java.util.Scanner;

public class WhileLoop102
{
    public static void main(String[] args)
    {
        Scanner thanos = new Scanner(System.in);

        /*
         * 1. Start (Loop control variable)
         * 2. Boolean Conditional {The loop runs while it's true and ends when it's false.)
         * 3. Increment (Optional, what the lop goes up/down by)
         */

        int pin = 0; // Part 1

        while(pin != 1234)
        {
            System.out.print("Enter your PIN: ");
            pin = thanos.nextInt();

            if(pin == 1234)
                System.out.print("You entered in the correct PIN. You may proceed. May the force be with you!\n");
            else
                System.out.print("Wrong PIN, WUMBO! Try again!\n");
        }
    }
}