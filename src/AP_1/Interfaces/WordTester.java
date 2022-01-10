package AP_1.Interfaces;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class WordTester
{
    public static void main( String args[] ) throws java.io.IOException
    {
//Scanner reads from .dat file
        Scanner file = new Scanner( new File("WordData.dat"));

//name scanner 'file', initialize 'size' from file input.
        int size = file.nextInt();
        file.nextLine();
        Word[] words = new Word[size];

        for(int i = 0; i < size; i++)
        {
            words[i] = new Word(file.nextLine());
        }
        Arrays.sort(words);

        for(int i = 0; i <size; i++)
        {
            System.out.println(words[i]);
        }
    }
}

