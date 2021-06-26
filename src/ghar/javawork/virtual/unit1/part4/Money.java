package ghar.javawork.virtual.unit1.part4;
import java.util.Scanner;
public class Money {
    public static void main(String[] args) {

        int quarters = 0;      // number of quarters
        int dimes = 0;         // number of dimes
        int nickels = 0;       // number of nickels
        int pennies = 0;       // number of pennies
        int totalCents = 0;    // total cents collected
        int dollars = 0;       // dollar amount
        int cents = 0;         // cents amount

        Scanner m = new Scanner(System.in);

        System.out.print("How many pennies do you have --> ");
        pennies = m.nextInt();

        System.out.print("How many nickels do you have --> ");
        nickels = m.nextInt();

        System.out.print("How many dimes do you have --> ");
        dimes = m.nextInt();

        System.out.println("How many quarters do you have --> ");
        quarters = m.nextInt();

        totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        dollars = totalCents / 100;
        cents = totalCents % 100;

        // recommended format:    Total value = 2 dollars and 46 cents;
        System.out.println("Total value = "+ dollars +  " dollars and " + cents + " cents");


    }


}