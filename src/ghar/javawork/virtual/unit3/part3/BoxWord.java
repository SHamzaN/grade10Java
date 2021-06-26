package ghar.javawork.virtual.unit3.part3;
import java.util.Scanner;
public class BoxWord{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = s.nextLine();
       System.out.println("Enter a word: ");
      String word1 = s.nextLine();
        System.out.println("Enter a word: ");
        String word2 = s.nextLine();

        //  for(int index = word.length(); index >= 0; index+ )
        //      System.out.println(word);


        for(int i=0; i < word.length();i++){
            System.out.println(word + " ");
        }
        for(int i=0; i < word1.length();i++){
            System.out.println(word1 + " ");
        }
        for(int i=0; i < word2.length();i++){
            System.out.println(word2 + " ");
        }
    }

}