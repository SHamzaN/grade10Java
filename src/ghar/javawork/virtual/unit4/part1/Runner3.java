package ghar.javawork.virtual.unit4.part1;

import ghar.javawork.virtual.unit4.part1.SurfaceArea;

import java.util.Scanner;
public class Runner3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        SurfaceArea output = new SurfaceArea();
        System.out.print("Enter side: ");
        int num = s.nextInt();
//        output.surfaceAreaV(num);
        System.out.println("\nVoid Method:");
        output.surfaceAreaV(num);

        System.out.println("\nReturn Method: ");
        System.out.print("The surface area is: ");
        System.out.println(output.surfaceAreaR(num));

    }
}
