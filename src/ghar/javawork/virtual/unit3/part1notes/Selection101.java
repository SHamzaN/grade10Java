package ghar.javawork.virtual.unit3.part1notes;

import java.util.Scanner;

public class Selection101
{
    public static void main(String[] args)
    {
        Scanner gandalf = new Scanner(System.in);

        System.out.print("What is your grade on the exam: ");
        int grade = gandalf.nextInt();

        // One-Way Selection
        //Relational Operators: < <= > >= == !=

        if(grade == 100) //if(boolean conditional)-> boolean conditional returns true or false, NO SEMICOLONS!!!
        {
            // if the boolean conditional is true these statements are exectued
            System.out.println("You get a peice of candy!!!");
            System.out.println("This is the best grade ever!!! XD");
        }

        System.out.println("Your grade is: " + grade);

    }
}