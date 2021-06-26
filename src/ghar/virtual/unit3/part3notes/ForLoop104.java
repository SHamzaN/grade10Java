package ghar.javawork.virtual.unit3.part3notes;

import java.util.Scanner;
public class ForLoop104
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = s.nextLine();

        System.out.print("Your word backwards: ");

        //backwards
        for(int index = word.length()-1; index >= 0; index--)
        {
            System.out.print(word.charAt(index));
        }

        System.out.println();

        /*System.out.print("Your word forwards: ");
        //fancy forwards
        for(int i = 0; i < word.length(); i++)
        {
            System.out.print(word.charAt(i));
        }*/

    }
}