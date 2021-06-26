package ghar.javawork.virtual.unit6.part1;

import java.util.Scanner;
public class Inheritance103
{
    public static void main(String[] args)
    {
        //Scanner s = new Scanner(System.in);
        //System.out.println("Enter grade level: ");
        //int g1 = s.nextInt();
        //Student3 stu = new Student3(g1);
        //Student3 stu = new Student3(9);
        //How do we handle multiple parameters with different inheritance levels?
        Student3 stu = new Student3(14,9);

        System.out.println("The student's GradeLevel is: " + stu.getGradeLevel());
        System.out.println("The student's age is: " + stu.getAge());

    }
}