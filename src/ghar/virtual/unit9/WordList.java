package ghar.javawork.virtual.unit9;

import java.util.*;

public class WordList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] words = new String[10];
        System.out.println("Enter 10 words: ");
        System.out.println();
        //  words[0] = scan.nextLine();
        //     words[1] = scan.nextLine();
        //   words[2] = scan.nextLine();
        //   words[3] = scan.nextLine();
        //    words[4] = scan.nextLine();
        //  words[5] = scan.nextLine();
        //    words[7] = scan.nextLine();
        //      words[8] = scan.nextLine();
        //    words[9] = scan.nextLine();
        // System.out.println(words[0]);
        // System.out.println(words[1]);
        // System.out.println(words[2]);
        // System.out.println(words[3]);
        // System.out.println(words[4]);
        // System.out.println(words[5]);
        // System.out.println(words[6]);
        // System.out.println(words[7]);
        // System.out.println(words[8]);
        // System.out.println(words[9]);

        for(int i = 0; i < 10; i++)
        {
            words[i] = scan.nextLine();
            System.out.println(words[i]);
        }
    }
}