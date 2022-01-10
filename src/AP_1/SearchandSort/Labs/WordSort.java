package AP_1.SearchandSort.Labs;

import java.util.Arrays;
import static java.lang.System.*;
public class WordSort
{
    private String[] wordRay;
    public WordSort(String line)
    {
        setList(line);
    }
    public void setList(String line)
    {
        wordRay = line.split(" ");
    }
    public void sort()
    {
        Arrays.sort(wordRay);
    }
    public String toString( )
    {
        String output="";

        for (int i = 0; i < wordRay.length; i++)
        {
            out.println("word " + i + " :: " + wordRay[i]);
        }
        return output+"\n\n";
    }
}
