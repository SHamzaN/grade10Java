package ghar.javawork.virtual.unit2.part3notes;

public class String101
{
    public static void main(String[] args)
    {
        //charAt()

        String str = "Adam Eve Smith"; // Spaces are also characters
        // index      0123456789

        char let1 = str.charAt(0); // A == 65
        char let2 = str.charAt(5); // E == 69
        char let3 = str.charAt(9); // S == 83     65 + 69 + 83 == 217


        System.out.println(let1);
        System.out.println(let1 + let2 + let3 + " " + let1 + let2 + let3);
        System.out.println("Your initials are : " + let1 + let2 + let3);
        System.out.println("" + let1 + let2 + let3);

        System.out.println("12 is the index for: " + str.charAt(12));  //'t'
        //System.out.println("30 is the index for: " + str.charAt(30)); //runtime error because index is larger than string.
        //	System.out.println("-1 is the index for: " + str.charAt(-1)); //runtime error because no like negative, it bad.



    }
}