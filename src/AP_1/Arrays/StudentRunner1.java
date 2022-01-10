package AP.Arrays;


public class StudentRunner1
{

    public static void main(String[] args)
    {
// TODO Auto-generated method stub
        Student stu1 = new Student("Mercedes", 11, 3.2);
        Student stu2 = new Student("Renjit", 12, 1.2);

        Student[] students = new Student[2];

//null by defualt, cannot  call any methods with null --> runtime error: null pointer exception
        System.out.println(students[0] + "\n\n" + students[1]);
        System.out.println();

        students[0] = stu1;
        students[1] = stu2;
        System.out.println(students[0] + "\n\n" + students[1]);

        int sum =  students[0].getGradeLevel() + students[1].getGradeLevel();

        System.out.println("\nThe sum of the grade levels is: " + sum);

    }

}
