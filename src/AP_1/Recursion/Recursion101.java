package AP_1.Recursion;


public class Recursion101
{
    private int j = 0;
    public static void main(String[] args)
    {
        Recursion101 test = new Recursion101();



        System.out.println("Calling iterative method::");
        count1();

        System.out.println("\n\nCalling recursive method::");
        test.count2();
    }

    public static void count1()
    {
        for(int k = 1; k <= 50; k++)
        {
            System.out.print(k + " ");
        }
    }

    //Recursive count
    public void count2()
    {
//int j = 0;
        j++;

        System.out.print(j + " ");

        if(j < 50) // exit condition
            count2();
    }
}
