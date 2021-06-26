package ghar.javawork.virtual.unit3.part3notes;

import java.util.Scanner;
public class ForLoop102
{
    public static void main(String args[])
    {
        // using a For Loop as a counter

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = s.nextLine();

        int len = word.length();
        int rCount = 0; //counter

        for(int i = 0; i <= len-1 ; i++)
        //     (start;   end;   increment)
        {
            if(word.charAt(i) == 'r')
            {
                rCount++;
            }
        }

        System.out.println("\nYour word is: " + word);
        System.out.println("Your word has " + rCount + " R's");

    }
}