//package AP.Arrays;
//
//import java.util.Scanner;
//public class StudentRunner2
//{
//
//    public static void main(String[] args)
//    {
//// TODO Auto-generated method stub
//        Scanner scan = new Scanner(System.in);
//
//        Student[] students = new Student[100]; // Physical size is 100 elements
//
//        int size = 0; // Tracks logical size of the array
//        String ans = "";
//
//        do
//        {
//            System.out.print("\nEnter student's name: ");
//            String name = scan.nextLine();
//            System.out.print("Enter student's grade level: ");
//            int gradeLevel = scan.nextInt();
//            System.out.print("Enter student's GPA: ");
//            double gpa = scan.nextDouble();
//            scan.nextLine(); //dummy read to consume remaining<enter> character from buffer
//
//// Student tmp = new Student(name,gradeLevel, gpa);
////
//// students[size] = tmp;
//            students[size] = new Student(name,gradeLevel,gpa); //Anonymous Object assigned into the array
//            size++;
//
//            System.out.print("\nDo you want to enter another student [y/n]: ");
//            ans = scan.nextLine();
//        }while(!ans.equalsIgnoreCase("n"));
//
//        System.out.println();
//
//        for(int i = 0; i < size; i++)
//            System.out.println(students[i] + "\n");
//    }
//
//}
