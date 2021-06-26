package ghar.javawork.virtual.unit8;
import java.util.Scanner;
public class TriangleLetter3
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rows = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a letter: ");
        String c1 = scan.nextLine();
        char c2 = c1.charAt(0);


        String output = "\n";
        for(int i = 1; i <=rows; i++){
            for(int j = rows; j> i; j--){
                output += " ";
            }
            for(int k = 1; k<=i; k++){
                output += c2;
            }

            output += "\n";
        }
        System.out.print(output);

    }
}
