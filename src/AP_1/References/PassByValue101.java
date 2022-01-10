package AP_1.References;


public class PassByValue101
{
    public static void main(String[] args)
    {
        int num1 = 10;
        System.out.println("Number Before:");
        System.out.println(num1);

        changeInt(num1);
        System.out.println("\nNumber After: ");
        System.out.println(num1);
    }

    public static void changeInt(int n1)
    {
        n1 = 30;
        System.out.println("\nNumber During: ");
        System.out.println(n1);

    }
}

