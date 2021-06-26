package ghar.javawork.virtual.unit8;

import java.util.Scanner;

public class TriangleLetter2 {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int rows = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a letter: ");
        String c1 = scan.nextLine();
        char c2 = c1.charAt(0);

        String output = "\n";
        for(int i = 1; i <=rows; i++){
            for(int j = rows; j> i - 1; j--){
                output += c2;
            }
            output += "\n";
        }
        System.out.print(output);

    }
}
