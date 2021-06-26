
package ghar.javawork.virtual.unit1.part4;

import java.util.Scanner;

public class Rectangle{


    public static void main(String[] args){
        Scanner rec = new Scanner(System.in);
        System.out.print("Enter the Length -->");
        int Length = rec.nextInt();

        System.out.println(" Enter the Width --> ");
        int width = rec.nextInt();

        int perimeter = 2 * Length + 2 * width;
        int area = Length * width;


        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);




    }
}