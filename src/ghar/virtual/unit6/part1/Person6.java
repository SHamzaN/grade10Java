package ghar.javawork.virtual.unit6.part1;

class Person6 //Super Class
{
    //private int age;
    //private String name;

    /*
     * Variables and methods that are "protected can only
     * be accessed by the sub classes and the super class itself.
     */
    protected int age;
    protected String name;

    public Person6(String n, int a)
    {
        //System.out.println("Person Constructor Called");
        age = a;
        name = n;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String output = "";

        output += "\nName: " + getName() +
                "\nAge:  " + getAge();

        return output;
    }
}
