package ghar.javawork.virtual.unit3.part4notes;

import java.util.Scanner;

public class WhileLoop103
{
    public static void main(String[] args)
    {
        Scanner danTDM = new Scanner(System.in);

        /*
         * 1. Start (Loop control variable)
         * 2. Boolean Conditional {The loop runs while it's true and ends when it's false.)
         * 3. Increment (Optional, what the lop goes up/down by)
         */

        String password = ""; // Part 1
        String correctPassword = "wumbo";

        while(!password.equals(correctPassword))
        {
            System.out.print("Enter your password: ");
            password = danTDM.nextLine();

            if(password.equals(correctPassword))
                System.out.print("You entered in the correct password. You may proceed. May the force be with you!\n");
            else
                System.out.print("Wrong password, WUMBO! Try again!\n");
        }
    }
}