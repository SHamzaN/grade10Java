package AP.Arrays.Labs2;

//import java.util.Scanner;
//
//public class Tardies
//{
//    // instance variables
//    private  Student[] students;    // list of students
//    private int numStudents;            // logical size of the array
//
//
//    // constructor
//    public Tardies()
//    {
//        students = new Student[50];   // instantiate array
//        numStudents = 0;
//    }
//
//    /** precondition: none
//     *  postcondition: students array has been populated with
//     *     Student objects from keyboard input. numStudents has
//     *     been updated to reflect the logical size of the
//     *     array student.
//     */
//    public void enterData()
//    {
//        Scanner keyboard = new Scanner(System.in);
//      String ans = "";
//      do {
//          System.out.println("==================");
//          System.out.println("Enter Student Data");
//          System.out.println("==================");
//          System.out.println("Enter last name --> ");
//          String lastName = keyboard.next();
//          System.out.println("Enter first name --> ");
//          String firstName = keyboard.next();
//          System.out.println("Enter number of tardies -->");
//          int numTardies = keyboard.nextInt();
//
//          students[numStudents] = new Student(firstName,lastName, numTardies);
//          numStudents++;
//          System.out.print("\nEnter another student [y/n]: ");
//          ans = keyboard.next();
//      } while ("y".equalsIgnoreCase(ans));
//        System.out.println();
//    }
//
//    /* @return the total number of tardies for all students
//     *    in the class.
//     */
//    public int getTotalTardies()
//    {
//        int count = 0;
//        for (int i = 0; i <numStudents; i++) {
//            count += students[i].getTardies();
//        }
//        return count;
//    }
//
//    /** precondition: none
//     *  postcondition: a summary report has been printed which includes
//     *     the total number of tardies for the entire class and a
//     *     list of names and tardies for every student in the class.
//     */
//    public void summaryReport()
//    {
//        System.out.println("==================================");
//        System.out.println("Class Summary - Tardy Total = " + getTotalTardies());
//        System.out.println("==================================");
//      for(Student student : students)
//      {
//          if(null != student)
//          System.out.println(student);
//      }
//
//    }
//
//    public static void main(String[] args)
//    {
//        Tardies app = new Tardies();
//        app.enterData();
//        app.summaryReport();
//    }
import java.util.*;
public class Tardies
{    private Student[] students = new Student[50];
    private int[] positives = new int[20];
    private int[] negatives = new int[20];
    private int numStudents = 0;                      // logical size of positives array
     private int n = 0;                      // logical size of negatives array    /** precondition: none     *  postcondition: nums has been populated with random numbers     *     in the range of -100 to 100.     */

     public void enterData()
     {
         Scanner keyboard = new Scanner(System.in);
      String ans = "";
      int count = 0;
      do {
          System.out.println("==================");
          System.out.println("Enter Student Data");
          System.out.println("==================");
          System.out.print("Enter last name --> ");
          String lastName = keyboard.next();
          System.out.print("Enter first name --> ");
          String firstName = keyboard.next();
          System.out.print("Enter number of tardies -->");
          int numTardies = keyboard.nextInt();

          students[numStudents] = new Student(firstName,lastName, numTardies);
          System.out.println();
          count += numTardies;

          numStudents++;

          System.out.print("\nEnter another student [y/n]: ");

          ans = keyboard.next();
      } while ("y".equalsIgnoreCase(ans));
        System.out.println();

         System.out.println("==================================");
        System.out.println("Class Summary - Tardy Total = " + count);
        System.out.println("==================================");

     }    /** precondition: none     *  postcondition: positives has been populated with all the     *     numbers in nums that were positive. The variable p has     *     has been updated to reflect the logical size of     *     positives array.     */
     public void populatePositives()
     {

     }    /** precondition: none     *  postcondition: negatives has been populated with all the     *     numbers in nums that were negative. The variable n has     *     has been updated to reflect the logical size of     *     negatives array.     */
     public void populateNegatives()
     {

     }    /** precondition: size >=0     *  postcondition: all the values of array have been printed      *     from index 0 to the logical size of the array.     *  @param array the array to be printed.     *  @param size the logical size of array     */
     public String print(int[] array, int size)
     {
         String arrays = "";
         for(int i = 0; i < size; i++)
         {
             arrays += array[i];
         }
         return arrays;

     }    /** precondition: none     *  postcondition: all three arrays have been printed with      *     appropriate labelling.     */
     public String toString()
     {
         String output = "";
         for (int i = 0; i < numStudents; i++)
         {
             output += students[i].getLastName() + ", " + students[i].getFirstName() + " " + students[i].getTardies();
             output += "\n";
         }
         return output;
     }
public static void main(String[] args)
{
    Tardies app = new Tardies();
    app.enterData();
    app.populatePositives();
    app.populateNegatives();
    System.out.println(app);
}
}
