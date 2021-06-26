package ghar.javawork.virtual.unit2.part3;
import java.util.Scanner;
public class MadLib
{
    public static void main(String[] args)
    {

        //Ask user to enter ghar.javawork.strings
        Scanner strings = new Scanner(System.in);


        System.out.print("Enter a NOUN: ");
        String newword = strings.nextLine();
        System.out.print("Enter a type of VEHICLE: ");
        String newword2 = strings.nextLine();
        System.out.print("Enter an ADJECTIVE: ");
        String newword3 = strings.nextLine();
        System.out.print("Enter an ADJECTIVE: ");
        String newword4 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword5 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword6 = strings.nextLine();
        System.out.print("Enter an adjective: ");
        String newword7 = strings.nextLine();
        System.out.print("Enter a VERB ending in 'ed': ");
        String newword8 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword9 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword10 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword11 = strings.nextLine();
        System.out.print("Enter a NOUN: ");
        String newword12 = strings.nextLine();





        //Replace [X] with variables from above!
        System.out.println();
        System.out.println("GILLIGAN'S ISLAND THEME");
        System.out.println();
        System.out.println("Just sit right back and you`ll hear a tale,");
        System.out.println("A tale of a fateful " + newword + ",");
        System.out.println("That started from this tropic port,");
        System.out.println("Aboard this tiny " + newword2 + ".");
        System.out.println();
        System.out.println("The mate was a " + newword3 + " sailor man,");
        System.out.println("The skipper " + newword4 + " and sure.");
        System.out.println("Five " + newword5 + " set sail that day,");
        System.out.println("For a three hour " + newword6 + ", a three hour " + newword6 + ".");
        System.out.println();System.out.println("The weather started getting " + newword7 + ",");
        System.out.println("The tiny " + newword2 + " was " + newword8 + ",");
        System.out.println("If not for the " + newword9 + " of the fearless crew,");
        System.out.println("The " + newword10 + " would be lost, the " + newword10 + " would be lost.");
        System.out.println();
        System.out.println("The " + newword2 + " set ground on the shore of this uncharted desert isle,");
        System.out.println("With Gilligan, The Skipper too,");
        System.out.println("The millionaire and his " + newword11 + ", The movie " + newword12 + ",");
        System.out.println("And The Rest, Here on Gilligan`s Isle.");
    }
}