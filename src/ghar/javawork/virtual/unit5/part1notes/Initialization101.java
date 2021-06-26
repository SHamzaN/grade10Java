package ghar.javawork.virtual.unit5.part1notes;
public class Initialization101
{
    int num1 = 10; //instance variable (global)
    int num2 = 30; //instance variable (global)

    //Instance variables will automatically be initialized to default values when you create an object

    //int num1;
    //int num2;

    public void initMethod1()
    {
        int num3 = 60;  //local variable
        int num4 = 99; //local variable

        // local variables MUST be manually initialized


        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
    }
}