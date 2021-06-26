package ghar.javawork.virtual.unit5.part1notes;

public class Constructors102
{
    // Purpose: initialize instances of a class

    int num1; // initialized to 0 using a unseen default constructor
    int num2;

    /**
     * How to create and recognize a constructor:
     * 1. Same name as the class
     * 2. No return type. (Not even void)
     */

    public Constructors102(int n1, int n2)
    {
        int num1 = n1;// Do not fall into this trap
        int num2 = n2;// This num1 and num2 are local variables and only have scope inside the constructor

        System.out.println("local num1: " + num1);
        System.out.println("local num2: " + num2);

        // Generally speaking, you do not want to create local variables in a constructor
    }

    public void outputValues()
    {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}