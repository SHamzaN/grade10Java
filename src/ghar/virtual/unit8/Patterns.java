package ghar.javawork.virtual.unit8;
import java.util.Scanner;
public class Patterns
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int rows = scan.nextInt();
        scan.nextLine();
//        String c1 = "*";
//        char c2 = c1.charAt(0);

     //   StringBuilder output = new StringBuilder();
     //   StringBuilder output1 = new StringBuilder();

        for(int i = 0; i <=rows; i++){
            for(int k = 0; k< i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}