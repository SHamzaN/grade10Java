package ghar.javawork.virtual.unit3.part2notes;

import java.util.Scanner;

public class Selection104
{
    public static void main(String[] args)
    {
        Scanner ironman = new Scanner(System.in);

        /**
         *	Things to do:
         *	90+			Swimming
         *	75 - 89		Soccer (futbol)
         *	65 - 74		Baseball
         *	55 - 64		Football
         *  33 - 54		Basketball
         *  0  - 32		Hockey
         *	Below 0		Competitive Maple Syrup Drinking
         */

        System.out.print("Please enter the outside temperature: ");
        byte choice = ironman.nextByte();
        String activity = "";

        //Multiple Selection
        if(choice >= 90)
            //activity = "swimming";
            System.out.println("swimming");
        else if(choice >= 75)
            //activity = "soccer (futbol)";
            System.out.println("soccer");
        else if(choice >= 65)
            //activity = "baseball";
            System.out.println("baseball");
		 /*else if(choice >= 55)
		 	activity = "football";
		 else if(choice >= 33)
		 	activity = "basketball";
		 else if(choice >= 0)
		 	activity = "hockey";
		 else
		 	activity = "competitive maple syrup drinking";

		 System.out.println("\nWe think you should try " + activity + ".\n");*/

    }
}