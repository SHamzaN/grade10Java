package ghar.javawork.basics;

import java.util.Scanner;

public class CubeofaNumber {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

       CubeofaNumber obj = new CubeofaNumber();
      int output = s.nextInt();
        System.out.println(obj.cubeNumber(output));
    }

    public  int cubeNumber(int x)
    {
        return x * x * x;
    }
}
