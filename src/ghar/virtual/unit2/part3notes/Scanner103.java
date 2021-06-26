package ghar.javawork.virtual.unit2.part3notes;

import java.util.Scanner;

public class Scanner103
{
    public static void main(String[] args)
    {
        Scanner luke = new Scanner(System.in);

        System.out.print("Enter in a name --> ");
        String name = luke.nextLine();

        System.out.print("Enter in an age --> ");
        byte age = luke.nextByte();

        System.out.println("\nYour name is: " + name);
        System.out.println("Your age is: " + age);

        luke.nextLine(); // dummy read clears out <enter> from memory of previous input.

        System.out.print("\nEnter in a second name --> ");
        String name2 = luke.nextLine();

        System.out.print("Enter in a second age --> ");
        byte age2 = luke.nextByte();

        System.out.println("\nYour name is: " + name2);
        System.out.println("Your age is: " + age2);
    }
}