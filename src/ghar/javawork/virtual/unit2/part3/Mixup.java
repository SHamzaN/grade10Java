package ghar.javawork.virtual.unit2.part3;
import java.util.Scanner;
public class Mixup
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string --> ");
        String mix = s.nextLine();
        System.out.println("Mixed up string = " + mix.substring(mix.length()/2) + mix.substring(0, (mix.length()/2)));
        // 0 is there to print out the first letter
    }
}