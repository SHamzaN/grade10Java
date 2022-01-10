//package AP.ArrayList;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class StudentRunner
//{
//    public static void main(String[] args)
//    {
////   Student[] students = new Student[5];
////   int size = 0;
//
//        ArrayList<Student> students = new ArrayList<Student>();
//
//        Scanner scan = new Scanner(System.in);
//
//        String ans = "";
//
//
//        while(!ans.equalsIgnoreCase("n"))
//        {
//            System.out.print("Enter in student name --> ");
//            String name = scan.nextLine();
//            System.out.print("Enter in student GPA --> ");
//            double gpa = scan.nextDouble();
//            System.out.print("Enter in Student GradeLevel --> ");
//            int gl = scan.nextInt();
//
//            scan.nextLine();// Dummy Read
//
//            //create an anonymous Student object and store in an array
////   students[size] = new Student(name,gpa,gl);
////   size++;
////
//            students.add(new Student(name,gpa,gl));
//
//            System.out.print("Would you like to enter another student [y/n] --> ");
//            ans = scan.nextLine();
//            System.out.println();
//
//        }
//
//        //toString
//        System.out.println("\ntoString");
//        //System.out.println(Arrays.toString(students));
//        System.out.println(students);
//
//        //Basic for loop
//        System.out.println("\nBasic for loop");
//
////       for(int i = 0; i < size; i++)
////       {
////       System.out.println(students[i] + "\n");
////       }
//
//        for(int i = 0; i < students.size();  i++)
//        {
//            System.out.println(students.get(i));
//        }
//
//        //Enhanced for loop
//        System.out.println("\nEnhanced For loop");
//        for(Student students1 : students)
//        {
//            System.out.println(students1 + "\n");
//        }
//
//
//
//        //replace the first student
//        //leeroy
//        //10.0
//        //9001
//        students.set(0, new Student ( "Leeroy" , 10.0, 9901));
//
//        System.out.println("\nEnhanced For loop");
//        for(Student students1 : students)
//        {
//            System.out.println(students1 + "\n");
//        }
//
//        students.get(2).setName( "Julia");
//        System.out.println(students);
//    }
//}
//
