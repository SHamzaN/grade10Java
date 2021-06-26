package ghar.javawork.virtual.unit5.part1notes;
public class Mutator101
{
    //Instance Variables
    private int num1;
    private int num2;

    //Constructor(s)
    public Mutator101(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    // Accessor Methods(aka Getters)
    // Accessors are generally return methods

    public int getNum1()
    {
        return num1;
    }

    public int getNum2()
    {
        return num2;
    }

    // Mutator Methods (aka Setters)
    // Mutators are generally void methods

    public void setNum1(int n1)
    {
        num1 = n1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }


}