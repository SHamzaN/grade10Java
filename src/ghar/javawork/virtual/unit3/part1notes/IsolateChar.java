package ghar.javawork.virtual.unit3.part1notes;

import java.util.Scanner;

public class IsolateChar
{
    public static void main(String[] args)
    {
        Scanner naruto = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String temp = naruto.nextLine();

        char first = temp.charAt(0);


        System.out.println("\nThe first letter is: " + first);
        //System.out.println("The ASCII value of the first letter is: " + (int)first);
    }
}