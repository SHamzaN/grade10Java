package ghar.javawork.virtual.unit3.part3;
import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter word --> ");
          // System.out.println("\n");
        String word = key.nextLine();

//        String word = "test";

        //DO NOT CHANGE THIS CODE BLOCK
        String width = ""; // there is no space between the quotes.

        for(int i = 1; i < word.length()-1;i++)
        {
            width += " "; // there is a single space between the quotes.

        }
        System.out.println( word);


//        //MAKE CHANGES DOWN HERE. USE WIDTH TO PRINT THE SPACES
       for(int i = 0;  i < word.length(); i++){
//       for(int i = 1;  i < word.length()-1; i++){
         System.out.print(word.substring(i, i + 1));
          System.out.print(width);

          if(i <= word.length()-1)
           System.out.print(word.substring(word.length() - i-1, word.length() - i));
           System.out.println();
        }
        System.out.println(word);
    }
}
