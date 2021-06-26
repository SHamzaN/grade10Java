package ghar.javawork.virtual.unit3.majorlab;

import java.util.Scanner;

public class Nim80 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Nim!");
        System.out.print("\n");
        //   int num = s.nextInt();
        int num;
        int coin = 12;
        while (coin > 0) {
            System.out.println("Coins: " + coin);
            System.out.println("How many coins will you take? ");
            num = s.nextInt();
            coin -= num;
        }
        System.out.println("Game over!");
    }
}