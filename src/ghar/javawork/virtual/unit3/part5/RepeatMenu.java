package ghar.javawork.virtual.unit3.part5;

import java.util.Scanner;

public class RepeatMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Dr. Pepper");
        System.out.println("2. Coke");
        System.out.println("3. Sprite");
        System.out.println("4. 7-UP");
        System.out.println("5. Diet Coke");
        System.out.print("\n");
        System.out.println("Selection: ");

        int num;
        do {
            num = s.nextInt();
            if (!(num <= 5 && num >= 1)) {
                System.out.println("Invalid Selection, please make a valid choice.");
                System.out.print("\n");
                System.out.println("Menu");
                System.out.println("1. Dr. Pepper");
                System.out.println("2. Coke");
                System.out.println("3. Sprite");
                System.out.println("4. 7-UP");
                System.out.println("5. Diet Coke");
                System.out.print("\n");
                System.out.println("Selection: ");

            }

        } while (!(num <= 5 && num >= 1));
        if (num == 1) {
            System.out.println("You have chosen " + "Dr.Pepper");
        }
        if (num == 2) {
            System.out.println("You have chosen " + "Coke");
        }
        if (num == 3){
            System.out.println("You have chosen " + " Sprite");
        }
        if (num == 4){
            System.out.println("You have chosen " + "7-UP");
        }
        if (num == 5){
            System.out.println("You have chosen " + "Diet Coke");
        }
    }
}
