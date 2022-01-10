package AP.Arrays;


public class Student
{
    //Instance variables
    private String name;
    private int gradeLevel;
    private double gpa;

//Constructors
//default
// three parameters

    public Student()
    {
        name = " ";
        gradeLevel = 0;
        gpa = 0;
    }

    public Student(String n, int gl, double g)
    {
        this.name = n;
        this.gradeLevel = gl;
        this.gpa = g;

    }

    //Accessor methods aka(Getters)
    public String getName()
    {
        return name;
    }
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    public double getGpa()
    {
        return gpa;
    }
    //Mutator methods aka(Setters)
    public void setName(String n)
    {
        this.name = n;
    }
    public void setGradeLevel(int gl)
    {
        this.gradeLevel = gl;
    }
    public void setGpa(double g)
    {
        this.gpa = g;
    }
//toString
//"Name: " +
//"\nGrade Level: " +

    @Override
    public String toString()
    {
        return "Name: " + getName() +
                "\nGrade Level: " + getGradeLevel() +
                "\nGPA: " + getGpa();
    }
}
