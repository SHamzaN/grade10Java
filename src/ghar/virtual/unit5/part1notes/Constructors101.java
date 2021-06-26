package ghar.javawork.virtual.unit5.part1notes;

public class Constructors101
{
    // Purpose: initialize instances of a class

    int num1; // initialized to 0 using a unseen default constructor
    int num2;

    /**
     * How to create and recognize a constructor:
     * 1. Same name as the class
     * 2. No return type. (Not even void)
     */

    // Constructor
    public Constructors101(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    //Void Method
    public void outputValues()
    {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
