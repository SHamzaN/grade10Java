package ghar.javawork.virtual.unit2.part3;
import java.util.Scanner;
public class FullName
{
    public static void main(String[] args)
    {
        //Ask user to enter first and last name
        Scanner fn = new Scanner(System.in);
        System.out.print("Enter first name--> ");
        String name = fn.nextLine();
        System.out.println("Enter last name--> ");
        String name2 = fn.nextLine();

        //print name in resverse
        System.out.println(name2 + ", " + name);
    }
}