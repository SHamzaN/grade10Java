package ghar.javawork.virtual.unit3.part2;

import java.util.Scanner;

public class RichterScale {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a magnitude on the Richter scale: ");
        double num = s.nextDouble();
        //  System.out.print("\nDamage = ");


        if(num >= 8){
            System.out.println("\nDamage = Most structures fall");
        } else if(num >= 7){
            System.out.println("\nDamage = Most buildings destroyed");
        } else if(num >= 6){
            System.out.println("\nDamage = Many buildings considerably damaged; some collapse");

        } else if(num >= 4.5){
            System.out.println("\nDamage = Damage to poorly constructed buildings");
        } else if(num >= 3.5){
            System.out.println("\nDamage = Felt by many people, no destruction");
        } else if(num >= 0){
            System.out.println("\nDamage = Generally not felt by peoplen");
        } else{
            System.out.println("\nDamage = This number is not valid");
        }

    }
}


