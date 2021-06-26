package ghar.javawork.virtual.unit3.part2;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Season --> ");
        String season = s.nextLine();

        if(season.equals("Winter")){
            System.out.println("\nSeason: " + season);
            System.out.println("Meteorological: December 21 - March 20");
            System.out.println("Astronomical: Winter Solstice - Vernal Equinox");
        }
        else if(season.equals("Spring")){
            System.out.println("\nSeason: " + season);
            System.out.println("Meteorological: March 20 - June 21");
            System.out.println("Astronomical: Vernal Equinox - Summer Solstice");

        }
        else if(season.equals("summer")){
            System.out.println("\nSeason: Summer");
            System.out.println("Meteorological: June 21 - September 22");
            System.out.println("Astronomical: Summer Solstice - Autumnal Equinox");
        }
        else if(season.equals("fAlL")){
            System.out.println("\nSeason: Fall");
            System.out.println("Meteorological: September 22 - December 21");
            System.out.println("Astronomical: Autumnal Equinox - Winter Solstice");
        }
    }
}