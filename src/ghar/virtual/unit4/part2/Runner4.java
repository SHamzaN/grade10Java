package ghar.javawork.virtual.unit4.part2;
import java.util.Scanner;
public class Runner4
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        PrimeReturn output = new PrimeReturn();
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        System.out.println(num + " is prime: " + output.isPrime(num));
    }
}