package ghar.javawork.virtual.unit4.part2;
import java.util.Scanner;
public class Runner3
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        GradeReturn output = new GradeReturn();
        System.out.println("Enter a numeric grade: ");
        int num = s.nextInt();

        System.out.println("Your grade is a(n): " + output.getGrade(num));
    }
}
