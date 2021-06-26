package ghar.javawork.virtual.unit2.part3notes;

public class String103
{
    public static void main(String[] args)
    {
        // length()

        String word = "tacocat";
        // index       0123456

        // length == 7
        // index range == [0..6]

        int len = word.length();

        System.out.println("The length of " + word + " is: " + len);
        System.out.println("The length of " + word + " is: " + word.length());

        // last letter
        System.out.println("The last letter is: " + word.charAt(6));// only works for ghar.javawork.strings of 7 characters
        System.out.println("The index of the last letter is: " + (word.length()-1)); // the highest index is always one less than the length
        System.out.println("The last letter is: " + word.charAt(word.length()-1));// charAt()
        System.out.println("The last letter is: " + word.substring( word.length()-1 , word.length() )); // subString()
        System.out.println("The last letter is: " + word.substring(word.length()-1)); // subString()
    }
}