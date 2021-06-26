package ghar.javawork.virtual.unit3.majorlab;
import java.util.Scanner;
public class Nim90 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Nim!");
        System.out.print("");
        int num1;
        int coin = 12;
        System.out.println( "\nCoins: O O O O O O O O O O O O " ); ;
        String o;
//       System.out.print("\n");
        while(coin > 0){
            o =  "O O O O O O O O O O O O " ;
            System.out.println("How many coins will you take? ");
            num1 = s.nextInt();
            coin -= num1;
            for(int i = coin; i > 0; i-= coin){
                System.out.print("Coins: "  );
                System.out.println(o.substring(0, i * 2));
            }
        }
        System.out.println("Game over!");
    }
}