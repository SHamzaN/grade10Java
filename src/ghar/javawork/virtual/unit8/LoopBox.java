package ghar.javawork.virtual.unit8;
import java.util.Scanner;
public class LoopBox {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rows = scan.nextInt();

        String c1 = "*";
        char c2 = c1.charAt(0);
        String c3 = "#";
        char c4 = c3.charAt(0);

        String output = "";

        for(int i = 1; i <= rows; i++){

            for(int c = rows; c >= i; c--)
            {
                output += c2;
            }
           for (int k = 1; k <= i; k++ ){
               output += c4;
           }
            output += "\n";
        }
        System.out.println(output);
    }
}