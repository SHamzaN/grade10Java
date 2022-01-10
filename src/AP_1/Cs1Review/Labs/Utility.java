package AP.Cs1Review.Labs;

import java.util.*;

public class Utility
{
    private static Scanner keyboard = new Scanner(System.in);

    private Utility() {

    }

    /** This method prompts a user to enter
     *  an integer value from the keyboard. It
     *  then reads and returns the integer value
     *  using the Scanner class's nextInt method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */


    public static int readInt(String prompt)
    {
        System.out.print(prompt);
        int num = keyboard.nextInt();
        keyboard.nextLine();
        return num;

    }

    /** This method prompts a user to enter
     *  a double value from the keyboard. It
     *  then reads and returns the double value
     *  using the Scanner class's nextDouble method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static double readDouble(String prompt)
    {
        System.out.print(prompt);
        double num1 = keyboard.nextDouble();
        keyboard.nextLine();
        return num1;
    }

    /** This method prompts a user to enter
     *  a string from the keyboard. It then
     *  reads and returns the string using
     *  the Scanner class's nextLine method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static String readString(String prompt)
    {
        System.out.print(prompt);
        return keyboard.nextLine();
    }

    /** This method prints blank lines on the
     *  console window.
     *  @param num the number of lines to display
     */
    public static void blankLines(int num)
    {
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
