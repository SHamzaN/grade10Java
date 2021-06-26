package ghar.javawork.virtual.unit1.part4;
import java.util.Scanner;
public class Powers{
    public static void main(String[] args){
        Scanner power = new Scanner(System.in);
        System.out.println("Please enter an integer--> ");
        int num1 = power.nextInt();

        int square = num1 * num1;
        System.out.println("The Square = " + square);
        int cube = num1 * num1 * num1;
        System.out.println("The Cube = " + cube);
        int fourthp = num1 * num1 * num1 * num1;
        System.out.println("The Fourth Power = " + fourthp);


    }
}