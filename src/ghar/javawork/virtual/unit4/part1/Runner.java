package ghar.javawork.virtual.unit4.part1;

import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        RectanglePerimeter output = new RectanglePerimeter();

        System.out.print("Enter the length: ");
        int length = s.nextInt();

        System.out.print("Enter the width: ");
        int width = s.nextInt();

        System.out.println("\nVoid Method :: ");
        output.perimeterV(width,length);

        System.out.println("\nReturn Method :: ");
        System.out.println("The perimeter is :: " + output.perimeterR(width,length));

    }
}
