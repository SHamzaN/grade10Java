package AP_1.Interfaces;

public class Word implements Comparable<Word>
{
    private String word;

    public Word( String s )
    {
        word = s;
    }

    public int compareTo( Word rhs )
    {
         if(word.length() != rhs.toString().length())
        {
        return   word.length()-rhs.toString().length();
        }
        else
        {
            return word.compareTo(rhs.toString());
        }

    }

    public String toString()
    {
        return word;
    }
}

