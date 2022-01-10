package AP_1.Recursion;


public class Recursion105
{
    public static void main(String[] args)
    {
// TODO Auto-generated method stub

        System.out.println("\n\nCalling Pre-Recursive Count Method");
        count2(1,5);
    }
    public static void count2(int a, int b)
    {
        if(a <= b)
        {
            System.out.println("Interrupting method completion; pushing " + a + " on the stack.");
            count2(a + 1, b); // recursive call;
            System.out.println("\nReturning to complete method; poppong " + a + " from stack.");
            System.out.print("Displaying popped value: " + a);

        }
    }
}

