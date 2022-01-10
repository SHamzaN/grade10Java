//package AP.Cs1Review;
//
//import java.util.Scanner;
//public class StudentRunner
//{
//    public static void main(String[] args)
//    {
//        Student[] students = new Student[100];
//
//        int size = 0;
//        Scanner s = new Scanner(System.in);
//
//        String ans = "";
//
//        while(!ans.equalsIgnoreCase("N"))
//        {
//            System.out.println("Enter in Student name -->");
//            String name = s.nextLine();
//            System.out.print("Enter in Student GPA -->");
//            double gpa = s.nextDouble();
//            System.out.print("Enter in Student GradeLevel -->");
//            int grl = s.nextInt();
//            s.nextLine();
//            System.out.println();
//            students[size] = new Student(name, gpa, grl);
//            size++;
//
//            System.out.print("Would you like to enter another student(Y/N)");
//            ans = s.nextLine();
//            System.out.println();
//        }
//
//        for(int i = 0; i < size; i++)
//        {
//            System.out.println(students[i] + "\n");
//        }
//
//        if(students[0].equals(students[1]))
//            System.out.println("The students are equal: ");
//
//        else
//            System.out.println("The Students are not equal: ");
//    }
//
//}
