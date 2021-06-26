package ghar.javawork.virtual.unit4.part1;

import java.util.Scanner;

public class Runner4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircleArea output = new CircleArea();
        System.out.println("Enter radius: ");
        double num = s.nextDouble();
        System.out.println("Void Method: ");
        output.areaV(num);

        System.out.println("\nReturn Method: ");
        System.out.println("The radius is: " + output.areaR(num));
    }
}
