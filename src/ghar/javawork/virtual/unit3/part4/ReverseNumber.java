package ghar.javawork.virtual.unit3.part4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int num1 = num;

        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println( num1 + " reversed is " + rev);

    }
}

