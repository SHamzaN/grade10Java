package ghar.javawork.virtual.unit5.part1notes;

public class Scope101
{
    int num1 = 10; // instance variable (global)
    int num2 = 30; // instance variable (global)

    /**
     *  Scope is determined by {}
     */

    public void scopeMethod1()
    {
        int num1 = 50; // local variable
        int num2 = 75; // local variable

        int sum = num1 + num2; // Local variables override the instance variables

        System.out.println(num1 + " +  " + num2 + " = " + sum);

    }


    public void scopeMethod2()
    {
        int diff = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + diff);

    }

}