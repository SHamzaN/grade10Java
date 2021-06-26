package ghar.javawork.virtual.unit6.part1;

public class Inheritance101
{
    public static void main(String[] args)
    {
        Person per = new Person();

        System.out.println("The person's age is: " + per.getAge());

        // Objects of the person class (super class) do not have access to the student class (sub class).
        //System.out.println("The person's grade level is: " + per.getGradeLevel());

        Student stu = new Student();

        System.out.println("The student's grade level is: " + stu.getGradeLevel());
        System.out.println("The student's age is: " + stu.getAge());
    }
}

class Person //Super class (aka Parent)
{
    private int age;

    public int getAge()
    {
        return age;
    }
}

class Student extends Person //Sub class (aka Child)
{
    private int gradeLevel = 12;

    public int getGradeLevel()
    {
        return gradeLevel;
    }

}