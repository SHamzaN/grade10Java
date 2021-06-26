package ghar.javawork.basics;

import java.util.Scanner;

public class WeightofaCarCarrierTrailer {
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
        int output = s.nextInt();
        System.out.println();
      int output2 = s.nextInt();
        System.out.println(getCarCarrierWeight(output,output2));

    }
    public static double getCarCarrierWeight(double carWeight, int numCars)
    {

       return carWeight * numCars;

    }
}
