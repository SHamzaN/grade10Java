//package AP.Cs1Review.Labs;
//
//public class WordsCompare {
//    private String wordOne, wordTwo;
//    private int compare;
//
//    public WordsCompare()
//    {
//        wordOne = "";
//        wordTwo = "";
//        compare = 0;
//
//    }
//
//    public WordsCompare(String one, String two)
//    {
//       this.wordOne = one;
//       this.wordTwo = two;
//    }
//
//    public void setWords(String one, String two)
//    {
//      wordOne = one;
//      wordTwo = two;
//    }
//
//    public void compare()
//    {
//        if (compare < 1)
//        {
//            compare = wordOne.compareTo(wordTwo);
//
//        }
//        else
//        {
//            compare = wordTwo.compareTo(wordOne);
//        }
//    }
//
//    public String toString()
//    {
//        if(compare<0) {
//            return wordOne + " should be placed before " + wordTwo +"\n";
//        } else {
//             return wordOne + " should be placed after " + wordTwo + "\n";
//        }
//    }
//}