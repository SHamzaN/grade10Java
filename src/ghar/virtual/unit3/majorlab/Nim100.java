package ghar.javawork.virtual.unit3.majorlab;

import java.util.Scanner;

public class Nim100 {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to Nim!");
    System.out.println("Player 1, enter your name: ");
   String player1 = s.nextLine();
    System.out.println("Player 2, enter your name: ");
    String player2 = s.nextLine();
    int num = 1;
    int num1;
    int coin = 12;
    System.out.println( "\nCoins: O O O O O O O O O O O O " ); ;
    String o;
    while(coin > 0) {
        o = "O O O O O O O O O O O O ";
        if (num % 2 == 1) {
            System.out.println(player1 + ",how many coins will you take?");
        } else {
            System.out.println(player2 + ",how many coins will you take?");
        }
//        System.out.println("How many coins will you take? ");
        num1 = s.nextInt();
        coin -= num1;
        num++;
        for (int i = coin; i > 0; i -= coin) {
            num1 = s.nextInt();
            coin -= num1;
            num++;
        }

        for (int i = coin; i > 0; i -= coin) {
            System.out.print("Coins: ");
            System.out.println(o.substring(0, i * 2));
        }
        if (coin < 1) {
            if (num % 2 == 0) {
                System.out.println(player1 + " got the last coin! Winner!");
            }

        }
    }
            System.out.println(player2 + " got the last coin! Winner!");

          }

      }


