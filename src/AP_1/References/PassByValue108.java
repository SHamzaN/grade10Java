package AP_1.References;


public class PassByValue108
{
    public static void main(String[] args)
    {
        Integer num1 = 10;
        System.out.println("Number Before: ");
        System.out.println(num1);

        changeInt(num1);

        System.out.println("\nNumber After: ");
        System.out.println(num1);

    }

    public static void changeInt(Integer n1)
    {
        n1 = 30; //AutoBoxing
        System.out.println("\nNumber During: ");
        System.out.println(n1);

    }
}

