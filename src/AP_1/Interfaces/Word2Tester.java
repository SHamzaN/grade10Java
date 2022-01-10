package AP_1.Interfaces;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Word2Tester
{
    public static void main( String args[] ) throws java.io.IOException
    {

        Scanner file = new Scanner( new File("Word2Data.dat"));
        int size = file.nextInt();
        file.nextLine();
        Word2[] words = new Word2[size];

        for(int i = 0; i < size; i++)
        {
            words[i] = new Word2(file.nextLine());
        }

        Arrays.sort(words);

        for (int i = 0; i < size; i++)
        {
            System.out.println(words[i]);
        }
    }
}