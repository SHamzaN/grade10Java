package AP_1.Recursion;


public class Recursion102
{

    public static void main(String[] args)
    {
        System.out.println("Calling iterative method::");
        skip1(4);
        System.out.println("\n\nCalling recursive method::");
        skip2(3);
    }

    //Iterative skip
    public static void skip1(int n)
    {
        for(int k = 1; k <= n; k++)
        {
            System.out.println("<skip>");
        }
    }

    //Recursive skip
    public static void skip2(int n)
    {
        if( n > 0) // Exit condition
        {
            System.out.println("<skip>");
            System.out.println("Pushing " + n + " on to the stack");
            skip2(n-1);
            System.out.println("Popping " + n + " off the stack");
        }
    }
}
