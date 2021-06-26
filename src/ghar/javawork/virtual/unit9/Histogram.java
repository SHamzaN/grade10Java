package ghar.javawork.virtual.unit9;

import java.util.*;
public class Histogram {
    public static void main(String[] args) {
        int[] arrayForUser = new int[100];
        int[] inputCounter = new int[arrayForUser.length];
        int userInput = 0;
        int inputSize = 0;
        System.out.println("Enter \"-1\" when you are done entering your numbers");
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        while(userInput != -1) {
            userInput = scan.nextInt();
            if(userInput != -1){
                arrayForUser[inputSize] = userInput;
                inputSize++;
            }
        }
        for (int i = 0; i < inputSize; i++) {
            int counter = 0;
            for (int j = 0; j <= i; j++) {
                if (arrayForUser[i] == arrayForUser[j]) {
                    counter++;
                    inputCounter[arrayForUser[i]] = counter;
                }
            }
        }
        for (int i = 0; i <= arrayForUser.length; i++) {
            if(i >= 0 && i < 10)
                System.out.println(i + " - " + inputCounter[i]);
        }
    }
}
