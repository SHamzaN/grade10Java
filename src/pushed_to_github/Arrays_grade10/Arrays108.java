//package AP.Arrays;
//
//import java.util.Scanner;
//public class Arrays108
//{
//
//    public static void main(String[] args)
//    {
//// TODO Auto-generated method stub
//        Scanner scan = new Scanner(System.in);
//        int[] grades = new int[100];
//        int grade = 0;
//        int index = 0; // tracks logical size of the array
//
//
//        while(grade != - 1)
//        {
//            System.out.print("Enter grades: ");
//            grade = scan.nextInt();
//            if(grade != -1) {
//                grades[index] = grade;
//                index++;
//
//            }
//
//
//        }
//
//        System.out.println();
//
//
//        //Enhanced for loop always go through the entire physical size of the array
////       for(int g : grades)
////       {
////       System.out.print(g + " ");
////       }
//
//        //Use a basic for loop to print out the logical array
//        for(int i = 0; i < index; i++)
//            System.out.print(grades[i] + " ");
//    }
//
//}
//
