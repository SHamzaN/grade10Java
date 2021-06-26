package ghar.javawork.virtual.unit3.part4;

import java.util.Scanner;

public class DigitAdder {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = s.nextInt();
            int sum = 0;
            int num1 = num;
            while(num >0)

            {
                sum = sum + num % 10;
                num = num /  10;
            }
          System.out.println(sum + " is the sum of the digits of " + num1);

    }
}
