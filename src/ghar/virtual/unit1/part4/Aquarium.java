package ghar.javawork.virtual.unit1.part4;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args)
    {
        final double LITTER_PER_GUPPIE = 5.338474623484662864;
        final double LITTER_PER_TETRA = 2.17474883347482947509;
        final double LITTER_PER_KILLI = 12.539487364819284749;
        final double GAL_PER_LITTER = 0.2641720524;
        Scanner fish = new Scanner(System.in);
        System.out.print("Number of guppies: ");
        double guppies = fish.nextDouble();
        System.out.print("Number of tetras: ");
        double tetras = fish.nextDouble();
        System.out.println("Number of killies: ");
        double killies = fish.nextDouble();
        System.out.println("\\\\\\\\\\\\\\Water Required for Aquarium///////");
        System.out.println("\t");
        double guppie = LITTER_PER_GUPPIE * 3;
        double tetra = LITTER_PER_TETRA * 4;
        double killi = LITTER_PER_KILLI * 6;
        double gallons = 0;
        //System.out.println("You will need: " + guppie + " liters of water for the 3 guppies.");
        System.out.println("You will need: ");
        //   System.out.println("\n");
        System.out.println(guppie + " liters of water for the 3 guppies.");
        System.out.println(tetra + " liters of water for the 4 tetras.");
        System.out.println(killi + " liters of water for the 6 killies.");
        System.out.println("\n");
        double total_litter = guppie + tetra + killi;
        gallons = total_litter * GAL_PER_LITTER;
        System.out.println("For a total of " + total_litter + " liters of water or" );
        System.out.println("               " + gallons + " gallons (aka American \"freedom\" units)");
    }
}