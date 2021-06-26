package ghar.javawork.virtual.unit6.part1;

class Student4 extends Person4 //Sub Class
{
    private int gradeLevel;

    public Student4(String n, int a, int g)
    {
        super(n,a);
        System.out.println("Student Constructor Called");

        gradeLevel = g;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }
}

