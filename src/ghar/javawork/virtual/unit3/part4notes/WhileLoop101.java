package ghar.javawork.virtual.unit3.part4notes;

public class WhileLoop101
{
    public static void main(String[] args)
    {
        /*
         * 1. Start (Loop control variable)
         * 2. Boolean Conditional {The loop runs while it's true and ends when it's false.)
         * 3. Increment (Optional, what the lop goes up/down by)
         */

        int lcv = 0; // Part 1, must be decalred and initialized outside of the loop.

        // while(lcv <= 10) // Part 2, NEVER PUT A SEMICOLON HERE!!!!
        //   {
        //    System.out.print(lcv + " ");
        //    lcv++; // Part 3, not always needed depending on how the loop is implemented.
        //  }

        System.out.println("\n");
        // System.out.println(lcv);
        System.out.println("\n");

        /*while(lcv >= 0)
        {
            System.out.print(lcv + " ");
            lcv--;
        }*/

        System.out.println("\n");
        // System.out.println(lcv);
        System.out.println("\n");

        lcv = 10;

        while(lcv >= 0)
        {
            System.out.print(lcv + " ");
            lcv-=2;
        }

    }
}