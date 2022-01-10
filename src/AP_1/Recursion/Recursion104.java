package AP_1.Recursion;


public class Recursion104
{

    public static void main(String[] args)
    {
// TODO Auto-generated method stub
        System.out.println("Calling Post-Recursive Count Method");
        count1(10,20);
        System.out.println("\n\nCalling Pre-Recursive Count Method");
        count2(10,20);
    }

    //Post-Recursive Count
    public static void count1(int a, int b)
    {
        if(a <= b)
        {
            System.out.print(a + " ");
            count1(a + 1, b); // recursive call;
        }
    }
    //Pre-Recursive Count
    public static void count2(int a, int b)
    {
        if(a <= b)
        {
            count2(a + 1, b); // recursive call;
            System.out.print(a + " ");

        }
    }
}

