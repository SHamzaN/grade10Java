package AP_1.References;


public class Student101
{
    private String name;
    private int gradeLevel;
    private double gpa;

    public Student101(String n, int gl, double g)
    {
        name = n;
        gradeLevel = gl;
        gpa = g;
    }

    public String getName()
    {
        return name;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setGradeLevel(int gl)
    {
        this.gradeLevel = gl;
    }

    public void setGPA(double g)
    {
        this.gpa = g;
    }

// @Override
// public String toString()
// {
// return "Name: " + name +
// "\nGradeLevel: " + getGradeLevel() +
// "\nGPA: " + gpa;
// }

    @Override
    public boolean equals(Object obj)
    {
        Student101 temp =  (Student101)obj;
        return this.getName().equals(temp.getName()) &&
                this.getGradeLevel() == temp.getGradeLevel() &&
                this.getGPA() == temp.getGPA();
    }
}

