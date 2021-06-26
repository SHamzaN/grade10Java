package ghar.javawork.virtual.unit3.part5notes;
public class DoWhileLoop102
{
    public static void main(String[] args)
    {
        // Pre-Conditional Loops
        for(int i = 100; i < 10; i+=10) // runs 0 times
            System.out.println("Hello");

        int value = 100;

        while(value < 10)  // runs 0 times
        {
            System.out.println("Hello");
            value+=10;
        }

        // Post-Conditional Loop

        int num = 100;

        do
        {
            System.out.println("Hello");
            num+=10;
        }while(num < 10);  // runs at least once

    }
}