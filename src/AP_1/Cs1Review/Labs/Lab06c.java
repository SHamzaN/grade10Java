package AP_1.Cs1Review.Labs;

import static java.lang.System.*;
public class Lab06c {
    public static void main( String args[] )
    { //add test cases
        WordsCompare wordscompare = new WordsCompare("abe","ape");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("giraffe", "gorilla");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("one", "two");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("fun", "funny");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("123", "19");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("193", "1910");
        wordscompare.compare();
        out.println(wordscompare);
        wordscompare.setWords("goofy", "godfather");
        out.println(wordscompare);
        wordscompare.setWords("funnel", "fun");
        out.println(wordscompare);





    }
}