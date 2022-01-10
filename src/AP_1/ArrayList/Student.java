package AP_1.ArrayList;


public class Student
{

    private String name;
    private double GPA;
    private int gradeLevel;

    public Student(String n, double gp, int gl)
    {
        name = n;
        GPA = gp;
        gradeLevel = gl;
    }

    public String getName()
    {
        return name;
    }

    public double getGPA()
    {
        return GPA;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setGPA(double gp)
    {
        GPA = gp;
    }

    public void setGradeLevel(int gl)
    {
        gradeLevel = gl;
    }

    public String toString()
    {
        return "\nName         :: " + getName() +
                "\nGpa        :: " + getGPA() +
                "\nGradeLevel :: " + getGradeLevel();
    }
}

