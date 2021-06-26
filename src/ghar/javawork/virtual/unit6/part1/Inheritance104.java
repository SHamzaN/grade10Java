package ghar.javawork.virtual.unit6.part1;

public class Inheritance104
{
    public static void main(String[] args)
    {
        Student4 stu = new Student4("Daniel",14,9);
        System.out.println("The student's name is: " + stu.getName());
        System.out.println("The student's GradeLevel is: " + stu.getGradeLevel());
        System.out.println("The student's age is: " + stu.getAge());

        Student4 stu2 = new Student4("Erica",13,6);
        System.out.println("The student's name is: " + stu2.getName());
        System.out.println("The student's GradeLevel is: " + stu2.getGradeLevel());
        System.out.println("The student's age is: " + stu2.getAge());

    }
}