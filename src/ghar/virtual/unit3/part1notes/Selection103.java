package ghar.javawork.virtual.unit3.part1notes;

import java.util.Scanner;

public class Selection103
{
    public static void main(String[] args)
    {

        Scanner hulk = new Scanner(System.in);

        System.out.println("A virus has descended upon HHS.");
        System.out.print("\nPlease enter how many times you have been bit: ");
        int particles = hulk.nextInt();

        //Two-Way Selection
        if(particles >= 10)
        {
            System.out.println("\nYou have the virus! I hope you enjoy the taste of brains! =)");
            System.out.println("Sorry, you can't go home. =(");
        }
        else // else never has a conditional, NO SEMICOLON!!
        {
            System.out.println("\nYou are safe, for now...");
        }



    }
}