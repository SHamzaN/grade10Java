package ghar.javawork.virtual.unit4.part1;

import java.util.Scanner;

public class Runner5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DashedWord output = new DashedWord();

        System.out.println("Enter a word: ");
        String word = s.nextLine();
        System.out.println("Void Method:");
        output.dashedV(word);

        System.out.print("\n");
        System.out.println("\nReturn Method: ");
        System.out.println("Dashed word: " + output.dashedR(word));
       // int status = 0;
       // System.out.println(word.charAt(status + 1));


    }
}
