package ghar.javawork.virtual.unit9;
import java.util.Arrays;
import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of grades to be entered: " );
        int no_of_grades = scan.nextInt();
        double[] gradesArray = new double[no_of_grades];
        double total = 0;

        for (int i = 0; i < no_of_grades; i++) {

            double s = scan.nextDouble();
            gradesArray[i] = s;
            //System.out.print("grade " + i + " ::  " );
            total  += s;

        }
           double average = total / no_of_grades ;
        System.out.println();
        System.out.println( "average = " + average);
        System.out.println("\n");
        System.out.print("array of grades: " + Arrays.toString(gradesArray));

    }
}