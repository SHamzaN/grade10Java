package ghar.javawork.virtual.unit3.part2notes;

import java.util.Scanner;

public class Equals102
{
    public static void main(String[] args)
    {
        Scanner deadpool = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = deadpool.nextLine();

        // When comparing ghar.javawork.strings do not use relational operators (e.g. == <= >= < >)
        if(password.equals("wumbo")) // is the same IDEA as password == "wumbo" [Use .equals() when comparing ghar.javawork.strings]
            //if(password.equalsIgnoreCase("wumbo"))// This will compare ignoring case.
            System.out.println("You have entered your password correctly! You may proceed.\nHave a nice day! =)");
        else
            System.out.println("You have not entered your password correctly! Enjoy your time with the sharks.\nHave a nice day! =)");
    }
}