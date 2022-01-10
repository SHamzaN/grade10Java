package AP_1.References;

public class Student104
{

    /**Fields**/

    private String name;

    private static int studentID = 1000;

    public Student104(String n)
    {
        name = n;
        studentID++;
    }

    @Override
    public String toString()
    {
        return "Name\t\t= " + name +
                "\nStudent ID\t= " + studentID;
    }
}
