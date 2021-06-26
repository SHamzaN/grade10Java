package ghar.javawork.virtual.unit2.part1;

public class QuickPick
{
    public static void main(String[] args)
    {
        //Create 6 int variables with a random value 1-50.
        int num1 = ((int)(Math.random()* 50)) ;
        int num2 = ((int) (Math.random() * 50));
        int num3 = ((int) (Math.random() * 50));
        int num4 = ((int) (Math.random() * 50));
        int num5 = ((int) (Math.random() * 50));
        int num6 = ((int) (Math.random() * 50));

        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("===========================");
        System.out.print((num1) + " ");
        System.out.print((num2) + " ");
        System.out.print((num3) + " ");
        System.out.print((num4) + " ");
        System.out.print((num5) + " ");
        System.out.print((num6) + " ");




        //System.out.print((int)((Math.random()*50)) + " ");
        //  System.out.print((int)((Math.random()*50)) + " ");
        //   System.out.print((int)((Math.random()*50)) + " ");
        //     System.out.print((int)((Math.random()*50)) + " ");
        //  System.out.print((int)((Math.random()*50)) + " ");
        //  System.out.print((int)((Math.random()*50)) + " ");

    }
}