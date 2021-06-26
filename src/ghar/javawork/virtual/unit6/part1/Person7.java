package ghar.javawork.virtual.unit6.part1;

class Person7 //Super Class
{
    protected int age;
    protected String name;

    public Person7(String n, int a)
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
    public void outputStuff(){
        System.out.println("THIS IS FROM THE SUPER CLASS");
    }

    @Override
    public String toString()
    {
        String output = "";

        output += "\nName: " + getName() +
                "\nAge:  " + getAge();

        return output;
    }
}
