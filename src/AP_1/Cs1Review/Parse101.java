package AP.Cs1Review;

import java.util.Scanner;
public class Parse101
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String numberString = scan.nextLine();

//parse methods allow you to convert strings to primitives
        int num = Integer.parseInt(numberString);

        double num2 = Double.parseDouble(numberString);


//other parse methods: parseStart, parseLong, parseByte, parseFloat, parseBoolean
        if(num % 2 == 0)
            System.out.println(numberString + " is even");
        else
            System.out.println(numberString + " is odd");

        System.out.println(numberString + " as a double: " + num2);
    }

}
