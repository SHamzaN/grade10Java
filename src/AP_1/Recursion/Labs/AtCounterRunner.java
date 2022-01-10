package AP_1.Recursion.Labs;

import static java.lang.System.*;
public class AtCounterRunner
{
    public static void main(String args[])
    {
//instantiate an AtCounter
        AtCounter c = new AtCounter();
//test the code
        System.out.println("0 0 has " + c.countAts(0,0) + " @s connected.");

//add more test cases
        out.println("\n2 5 has " + c.countAts(2,5) + " @s connected.");

        out.println("\n5 0 has " + c.countAts(5,0) + " @s connected.");

        out.println("\n9 9 has " + c.countAts(9,9) + " @s connected.");

        out.println("\n3 9 has " + c.countAts(3,9) + " @s connected.");

        out.println("\n " + c);
    }
}
