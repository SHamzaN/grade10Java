package ghar.javawork.virtual.unit2.part3;
import java.util.Scanner;
public class Acronym
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner letter = new Scanner(System.in);
        // String words = "";



        System.out.println("Enter 3 words --> ");
        //    String word1 = letter.next();
        //  String word2 = letter.next();
        //    String word3 = letter.next();
        //  String sub1 = words.substring(0,1);
        //  String sub2 = words.substring(0,1);
        //    String sub3 = words.substring(0,1);
        //  System.out.print("New word = "+ word1 + word2 + word3);
        //  System.out.println( sub1 + sub2 + sub3);
        String words = letter.next().substring(0,1);
        String words1 = letter.next().substring(0,1);
        String words2 = letter.next().substring(0,1);
        System.out.println("New word = " + words + words1 + words2);

        // I tried, but i couldent do it so i put them in the same line

    }
}