package ghar.javawork.virtual.unit2.part3;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args)
    {
        // Start here!

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string --> ");
        String word = s.nextLine();


        int index = word.indexOf("a");



        System.out.println(word.substring(0,index) + '*' + word.substring(index + 1) );


    }
}
