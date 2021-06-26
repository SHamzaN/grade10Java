package ghar.javawork.virtual.unit3.part3notes;

import java.util.Scanner;
public class ForLoop105
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        // forward loop backwards String

        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        int len = word.length();

        System.out.print("Your word backwards :: ");

        for(int i = 0; i <= len-1; i++)
        {
            System.out.print(word.charAt( (len-1) - i ));
        }
    }
}