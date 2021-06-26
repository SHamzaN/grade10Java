package ghar.javawork.virtual.unit3.part1;

import java.util.Scanner;

public class DiscountDeterminer {
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the original bill amount :: ");
        double amountIn = s.nextDouble();

       double discountedAmount = 0.0f;

        if(amountIn > 2000 ){
           discountedAmount = amountIn *  .85;

        }
        if (amountIn <= 2000){
            discountedAmount = amountIn;
        }
        System.out.println("Bill after discount :: "  + discountedAmount);

    }
}
