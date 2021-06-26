package ghar.javawork.virtual.unit2.part1;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;



        System.out.print("Enter 1st Integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Integer: ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd Integer: " );
        num3 = sc.nextInt();
        System.out.print("\n");

        //  int min = Math.min(num1, (Math.min(num2, num3)));

        int min = Math.min(num1, (Math.min(num2, num3)));
        System.out.println("Smallest = " + min);
        int  max = Math.max(num1, (Math.max(num2, num3)));
        System.out.println("Largest = " + max);



    }
}