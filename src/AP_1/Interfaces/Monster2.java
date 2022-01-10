package AP_1.Interfaces;

import static java.lang.System.*;
public class Monster2 implements Comparable
{
    private int myWeight;
    private int myHeight;
    private int myAge;
    //write a default Constructor
    public Monster2()
    {
        myWeight = 0;
        myHeight = 0;
        myAge = 0;
    }
    //write an initialization constructor with an int parameter ht
    public Monster2(int ht)
    {
        myHeight = ht;
    }
    //write an initialization constructor with int parameters ht and wt
    public Monster2(int ht, int wt)
    {
        myHeight = ht;
        myWeight = wt;
    }
    //write an initialization constructor with int parameters ht, wt, and age
    public Monster2(int ht, int wt, int age)
    {
        myHeight = ht;
        myWeight = wt;
        myAge = age;
    }
    //modifiers - write set methods for height, weight, and age
    public void setHeight(int height)
    {
        this.myHeight = height;

    }

    public void setWeight(int weight)
    {
        this.myWeight = weight;

    }

    public void setAge(int age)
    {
        this.myAge = age;

    }
    //accessors - write get methods for height, weight, and age
    public int Monster2Height()
    {

        return this.myHeight;
    }

    public int Monster2Weight()
    {

        return this.myWeight;
    }

    public int Monster2Age()
    {

        return this.myAge;
    }
    //creates a new copy of this Object
    public Object clone()
    {
        return new Monster2(myHeight,myWeight,myAge);
    }

    public boolean equals( Object obj )
    {
        Monster2 temp =  (Monster2)obj;
        if(myHeight == temp.Monster2Height() && myWeight == temp.Monster2Weight() && myAge == temp.Monster2Age())
        {
            return true;
        }
        return false;
    }

    public int compareTo( Object obj )
    {
        Monster2 rhs = (Monster2)obj;
        if(this.myHeight > rhs.Monster2Height() && this.myWeight > rhs.Monster2Weight() && this.myAge > rhs.Monster2Age())
        {
            return 1;
        }

        return -1;

    } //write a toString() method

    @Override
    public String toString()
    {
        return "" + Monster2Height() + " " + Monster2Weight() + " " + Monster2Age();
    }
}
