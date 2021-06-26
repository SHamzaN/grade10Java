package ghar.javawork.virtual.unit3.part4notes;

import java.util.Scanner;

public class WhileLoop104
{
    public static void main(String[] args)
    {
        Scanner markiplier = new Scanner(System.in);

        int grade = 0;
        int numGrades = 0; //Counter
        int sum = 0; //Accumulator
        double average = 0;

        System.out.println("Enter \"-1\" when finished entering grades.");

        while(grade != -1) //flag or sentinel value
        {
            System.out.print("Enter grade " + (numGrades + 1) + ": ");
            grade = markiplier.nextInt();

            sum += grade;
            numGrades++;

// 			if(grade != -1)
// 			{
// 				sum += grade;
// 				numGrades++;
// 			}
        }

        average = (double) sum / numGrades;

        System.out.println("The average is: " + average);

    }
}