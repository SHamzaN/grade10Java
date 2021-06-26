package ghar.javawork.virtual.unit7.notes;
public class Boolean101
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 7;
        boolean answer = num1 < num2;

        if(answer == true)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is greater than " + num2);

        if(answer == false)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is greater than " + num2);

        if(answer)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is greater than " + num2);

        if(answer)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is greater than " + num2);


    }
}