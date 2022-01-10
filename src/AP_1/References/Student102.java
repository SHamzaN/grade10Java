package AP_1.References;


public class Student102
{

    private String name;

    public Student102 (String n)
    {
        name = n;
    }

    public void setName(String n)
    {
        name = n;
    }

    @Override
    public String toString()
    {
        return "Name: " + name;
    }
}


