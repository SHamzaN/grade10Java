package ghar.javawork.virtual.unit1.part3notes;

/**
 * This program shows arithmetic shortcut operations
 * x+=10; is the same as x = x +10;
 */

public class Operators107
{
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println("num equals " + num);

        num += 10; //Addition shortcut
        System.out.println("num equals " + num);

        num -= 10; //Subtraction shortcut
        System.out.println("num equals " + num);

        num *= 10; //Multiplication shortcut
        System.out.println("num equals " + num);

        num /= 10; //Division shortcut
        System.out.println("num equals " + num);

        num %= 10; //Modulus division shortcut
        System.out.println("num equals " + num);

    }
}