package ghar.javawork.virtual.unit1.part4notes;
import java.util.Scanner;


public class Scanner102
{
    public static void main(String[] args)
    {
        //1. Import Scanner Class

        //2. Create Scanner Object

        //3. Prompt for input with print()

        //4. Capture input with nextInt() or nextDouble()

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num1 = input.nextInt();
        System.out.println("You entered: " + num1);

        System.out.println("Enter an double");
        double num2 = input.nextDouble();
        System.out.println("You entered: " + num2);





    }
}