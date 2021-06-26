package ghar.javawork.basics;

import java.util.Scanner;

class Scratchpad
{
    public static void main(String[] args)
    {
        // Add your own tests here
        Scanner s = new Scanner(System.in);
        double output = s.nextDouble();
        System.out.println(getArea(output));
    }

    // Copy and paste your Unit Test method here
    public static double getArea(double radius)
    {
        return  radius * radius * Math.PI;
    }


}
