package ghar.javawork.virtual.unit5.part1notes;

public class Constructors104
{
    // Purpose: initialize instances of a class

    int num1; // initialized to 0 using an unseen default constructor method
    int num2;

    /** How to create and recognize a constructor:
     *  1. Same name as the class
     *  2. No return type. */

    public Constructors104(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    //Default constructor (no parameters)
	/*public Constructors104()
	{
		num1 = 23;
		num2 = 42;
	}*/

    /*public Constructors104(int n1)
	{
		num1 = n1;
		num2 = 96;
	}*/

    public void outputValues()
    {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }



}