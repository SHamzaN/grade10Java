package ghar.javawork.virtual.unit5.part1notes;

public class Constructors103 {
    // Purpose: initialize instances of a class

    int num1; // initialized to 0 using an unseen default constructor
    int num2;

    /**
     * How to create and recognize a constructor:
     * 1. Same name as the class
     * 2. No return type.
     */

//	public Constructors103(int num1, int num2)
//	{
    //  local = instance
//		num1 = num1;// Do not fall into this trap!
//		num2 = num2;// Avoid giving the same name to both the local and instance variables. It's confusing!
//	}

	/*public Constructors103(int n1, int n2)
	{
		// Technique #1 (preferable)
		// Use different names for the local and instance variables
		num1 = n1;
		num2 = n2;
	}*/
    public Constructors103(int num1, int num2) {
        // Technique #2
        // "this" references the instance variable

        //  instance = local
        this.num1 = num1;
        this.num2 = num2;
    }

    public void outputValues() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }


}