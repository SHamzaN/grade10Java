//package AP.ArrayList.Labs;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import static java.lang.System.*;
//public class Words
//{
//    private ArrayList<Word> words;
//    public Words()
//    {
//        setWords("");
//    }
//    public Words(String wordList)
//    {
//        words = new ArrayList<Word>();
//
//        String[] in = wordList.split(" ");
//        for(String s : in)
//        {
//            words.add(new Word(s));
//        }
//
//    }
//    public void setWords(String wordList)
//    {
//        words = new ArrayList<Word>();
//
//        String[] in = wordList.split(" ");
//        for(String s : in)
//        {
//            words.add(new Word(s));
//        }
//    }
//    public int countWordsWithXChars(int size)
//    {
//        int count=0;
//        for (Word word : words) {
//            if (word.getLength() == size) {
//                count++;
//            }
//        }
//        return count;
//    }
//    //this method will remove all words with a specified size / length
////this method will also return the sum of the vowels in all words removed
//    public int removeWordsWithXChars(int size)
//    {
//        int sumRemovedWordsVowels = 0;
//        ArrayList<Word> removedlist = new ArrayList<>();
//        for(Word word: words){
//            if(word.getLength() == size){
//                removedlist.add(word);
//            }
//        }
//
//        for (Word removedWord: removedlist)
//        {
//            sumRemovedWordsVowels += removedWord.getNumVowels();
//            for (int i = 0; i < words.size(); i++) {
//                if(words.get(i).equals(removedWord))
//                    words.remove(i);
//            }
//        }
//        return sumRemovedWordsVowels;
//    }
//    public int countWordsWithXVowels(int numVowels)
//    {
//        int count=0;
//        for (Word word : words) {
//            if (word.getNumVowels() == numVowels) {
//                count++;
//            }
//        }
//        return count;
//
//    }
//    public String toString()
//    {
//        return "" + words;
//
//    }
//
//}
