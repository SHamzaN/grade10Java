package ghar.javawork.virtual.unit6.part1;

class Student7 extends Person7 //Sub Class
{
    private int gradeLevel;

    public Student7(String n, int a, int g)
    {
        super(n,a); //Must be the first statment
        //System.out.println("Student Constructor Called");
        gradeLevel = g;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }
    @Override
    public void outputStuff(){
        super.outputStuff();
        System.out.println("THIS IS FROM THE SUB CLASS");
    }



    @Override
    public String toString()
    {
        String output = "";

        /*output += "\nName(method): " + getName() +
        "\nAge(method): "  + getAge() +
        "\nName(var): " + name +
        "\nAge(var): "  + age +
        "\nGrade Level: " + getGradeLevel();*/

        output += super.toString() + "\nGrade Level: " + getGradeLevel();

        return output;
    }
}
