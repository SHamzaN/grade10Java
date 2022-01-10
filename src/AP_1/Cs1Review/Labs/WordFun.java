package AP_1.Cs1Review.Labs;

import static java.lang.System.*;
public class WordFun
{
    private String word;

    public WordFun()
    {

    }
    public WordFun(String w)
    {
        this.word = w;
    }
    public void setWord(String w)
    {
        word = w;
    }
    public void makeUpper()
    {
        out.println(word);
      String output =  word.toUpperCase();
        out.println("\n" +output);
    }

    public void addHyphen()
    {
        int loc;
        loc = word.indexOf(" ");
        String spaced = word.substring(0,loc);
       String secondHalf = word.substring(loc + 1, word.length());
        out.println(spaced.toUpperCase() + "-" + secondHalf.toUpperCase());
    }

    public String toString()
    {
        return "";
    }
}