package ghar.javawork.virtual.unit5.part1;

public class Farm
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println("****************************");
        System.out.println("  Test Default Constructor ");
        System.out.println("****************************");

        FarmAnimal idk = new FarmAnimal();
        FarmAnimal second = new FarmAnimal("John Chisum",50,12,5, 10);

        System.out.println("Farmer Name     :" + idk.getName());
        System.out.println("Cows            : " + idk.getCows());
        System.out.println("Horses          : " + idk.getHorses());
        System.out.println("Pigs            : " + idk.getPigs());
        System.out.println("Chickens        : " + idk.getChickens());
        System.out.println();
        System.out.println("****************************");
        System.out.println("  Test 2nd Constructor ");
        System.out.println("****************************");

        System.out.println("Farmer Name     : " + second.getName());
        System.out.println("Cows            : " + second.getCows());
        System.out.println("Horses          : " + second.getHorses());
        System.out.println("Pigs            : " + second.getPigs());
        System.out.println("Chickens        : " + second.getChickens());
    }
}
