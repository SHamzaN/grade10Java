package ghar.javawork.virtual.unit3.part3notes;

// import java.util.Scanner;
// public class ForLoop103
// {
// 	public static void main(String args[])
// 	{
// 		Scanner s = new Scanner(System.in);

// 		// 1.Start   2.End(conditional)   3.Increment(interval)   NO SEMICOLONS AT END OF FOR

// 		System.out.print("Enter a start value: ");
// 		int start = s.nextInt();

// 		System.out.print("Enter an end value: ");
// 		int end = s.nextInt();

// 		System.out.print("Enter the increment value: ");
// 		int inc = s.nextInt();

// 		for (int i = start; i <= end; i += inc)
// 		{
// 			System.out.println("The number is "+i);
// 			System.out.println("How long can this go on?");
// 		}
// 	}
// }

import java.util.Scanner;
public class ForLoop103
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        // 1.Start   2.End(conditional)   3.Increment(interval)   NO SEMICOLONS AT END OF FOR

        System.out.print("Enter a start value: ");
        int start = s.nextInt();

        System.out.print("Enter an end value: ");
        int end = s.nextInt();

        System.out.print("Enter the increment value: ");
        int inc = s.nextInt();

        for (int i = start; i <= end; i += inc)
        {
            System.out.println("The number is "+i);
            System.out.println("How long can this go on?");
        }
    }
}