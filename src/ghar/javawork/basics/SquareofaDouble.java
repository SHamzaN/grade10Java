package ghar.javawork.basics;

import java.util.Scanner;

public class SquareofaDouble {
    public static void main(String[] args){
       SquareofaDouble obj = new SquareofaDouble();
        Scanner s = new Scanner(System.in);
        int output = s.nextInt();
        System.out.println(obj.square(output));
    }
    public  double square(double x)
    {
        return x * x;

    }


}
