package ghar.javawork.virtual.unit2.part3;
import java.util.Scanner;
public class LastLetter
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string --> ");
        String s = sc.nextLine();

        System.out.println("Last letter = " + s.substring(s.length() -1));

    }
}