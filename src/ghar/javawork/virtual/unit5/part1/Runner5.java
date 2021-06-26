package ghar.javawork.virtual.unit5.part1;

import java.util.Scanner;

public class Runner5
{
    public static void main(String args[])
    {
        Assignment defaultGrade = new Assignment();
        Assignment grade = new Assignment("Test", "Chapter 1 Test", 95);

        System.out.println("\n/**************************************/");
        System.out.println("/*       Test Default Constuctor      */");
        System.out.println("/*        and Accessor methods        */");
        System.out.println("/**************************************/");
        System.out.println("Type         : " + defaultGrade.getType());
        System.out.println("Name         : " + defaultGrade.getName());
        System.out.println("Score        : " + defaultGrade.getScore());
        System.out.println("Letter Grade : " + defaultGrade.getLetterGrade());

        System.out.println("\n/**************************************/");
        System.out.println("/*        Test 2nd Constuctor         */");
        System.out.println("/*        and Accessor methods        */");
        System.out.println("/**************************************/");
        System.out.println("Type         : " + grade.getType());
        System.out.println("Name         : " + grade.getName());
        System.out.println("Score        : " + grade.getScore());
        System.out.println("Letter Grade : " + grade.getLetterGrade());

        grade.setType("Test");
        grade.setName("Chapter 2 Test");
        grade.setScore(75);

        System.out.println("\n/**************************************/");
        System.out.println("/*       Test Mutator Constuctor      */");
        System.out.println("/*        and Accessor methods        */");
        System.out.println("/**************************************/");
        System.out.println("Type         : " + grade.getType());
        System.out.println("Name         : " + grade.getName());
        System.out.println("Score        : " + grade.getScore());
        System.out.println("Letter Grade : " + grade.getLetterGrade());

    }
}
