package AP_1.Interfaces;

import java.util.Scanner;
import static java.lang.System.*;
public class Lab18a
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);

        String monsterone;
        int size1;
        String monstertwo;
        int size2 ;
//ask for name and size
        out.print("Enter 1st monster's name : ");
        monsterone = keyboard.next();
        out.print("Enter 1st monster's size : ");
        size1 = keyboard.nextInt();


//instantiate monster one
        Monster monsterOne = new Monster(monsterone,size1);

//ask for name and size

        out.print("Enter 2nd monster's name : ");
        monstertwo = keyboard.next();
        out.print("Enter 2nd monster's size : ");
       size2 = keyboard.nextInt();
//instantiate monster two
        Monster monsterTwo = new Monster(monstertwo,size2);

        out.println("\nMonster 1 - " +monsterone + " " + size1);
        out.println("Monster 2 - " +monstertwo + " " + size2);
        out.println();

        if (monsterOne.isBigger(monsterTwo))
        {
            out.println("Monster one" + " is bigger than " + "Monster two");
        }
        else
        {
            out.println("Monster one" + " is smaller than " + "Monster two");
        }
        if (monsterOne.namesTheSame(monsterTwo))
        {
            out.println("Monster one has the same name as Monster two");
        }
        else
            out.println("Monster one does not have the same name as Monster two");

    }
}

