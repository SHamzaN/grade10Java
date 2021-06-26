package ghar.javawork.virtual.unit3.part2notes;
import java.util.Scanner;

public class Equals101
{
    public static void main(String[] args)
    {
        Scanner deadpool = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int pin = deadpool.nextInt();

        if(pin == 1234)
            System.out.println("You have entered the correct PIN! You may proceed.\nHave a nice day! =)");
        else
            System.out.println("You have not entered the correct PIN! Enjoy your time with the sharks.\nHave a nice day! =)");
    }
}