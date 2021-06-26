package ghar.javawork.virtual.unit2.part1;
public class RPG
{
    public static void main(String[] args)
    {
        //Define 6 variables to store the random hit values. Assign each variable a random value [0-20].
        int hit1 = ((int)(Math.random()* 20));
        int hit2 = ((int)(Math.random()* 20));
        int hit3 = ((int)(Math.random()* 20));
        int hit4 = ((int)(Math.random()* 20));
        int hit5 = ((int)(Math.random()* 20));
        int hit6 = ((int)(Math.random()* 20));

        //Create variables for the highest, lowest, and average hit. Assign them values using the methods Math.max( ), Math.min( ) and Math.round( )
        int experience = ((int)(Math.random()* 131) + 5);
        int minhit = Math.min(hit1, (Math.min(hit2, hit3) + hit4 + hit5 + hit6));
        int maxhit =  Math.max(hit1, (Math.max(hit2, hit3) + hit4 + hit5 + hit6));
        double average = (hit1 + hit2  + hit3 + hit4 + hit5  + hit6) / 6.0;

        long average_rounded =  Math.round(average);


        //Print the output.
        System.out.println("You open the chamber door to see what lies beyond.");
        System.out.println("A demogorgon jumps out and attacks!");
        System.out.println("You deftly pull out your mighty blade and defend yourself :");
        System.out.println("You hit the demogorogn for " + hit1 + " points of damage.");
        System.out.println("You hit the demogorogn for " + hit2 + " points of damage.");
        System.out.println("You hit the demogorogn for " + hit3 + " points of damage.");
        System.out.println("You hit the demogorogn for " + hit4 + " points of damage.");
        System.out.println("You hit the demogorogn for " + hit5 + " points of damage.");
        System.out.println("You hit the demogorogn for " + hit6 + " points of damage.");



        System.out.println(" The demogorgon falls to the floor, lifeless.");
        System.out.println("Congratulations!  You earned " + experience + " points of experience");
        System.out.println("\n");
        System.out.println("Battle summary");
        System.out.println("==============");
        System.out.println("Max hit: " + maxhit );
        System.out.println("Min hit: " + minhit );
        System.out.println("Hit average: " + average_rounded);






    }
}