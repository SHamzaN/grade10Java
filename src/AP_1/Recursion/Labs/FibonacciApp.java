package AP_1.Recursion.Labs;

import java.util.*;

public class FibonacciApp
{
    public static void main(String[] args)
    {
        FibonacciTester f = new FibonacciTester();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number -->");
        int n = keyboard.nextInt();
        int result = f.fibonacci(n);
        System.out.println("Fibonacci("+n+") = " + result);
    }
}

class FibonacciTester
{
    public int fibonacci(int n)
    {
       if (n <= 1)
       {
           return n;
       }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

