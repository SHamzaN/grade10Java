package ghar.javawork.virtual.unit3.part5;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        // System.out.println("Enter a number: ");
        //   num = s.nextInt();
        int num2 = 1;
        int num1 = 0;
        do{
            System.out.print("Enter a number: ");
            num = s.nextInt();
            if(num > num1){
                //System.out.println();
                num1 = num;

            }
            num2++;

        }while(num2 < 11);
        System.out.println();
        System.out.println("\nThe largest number is " + num1);
    }
}
