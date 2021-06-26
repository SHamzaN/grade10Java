package ghar.javawork.virtual.unit6.part2;

import ghar.javawork.virtual.unit6.part2.CombinationLock;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        CombinationLock myLock = new CombinationLock("11-22-33");
        System.out.println(myLock);
        System.out.println();
        myLock.open();
        System.out.println(myLock);
        myLock.close();

        System.out.println();
        System.out.println("Change combination to 44-55-66");
        Scanner sempai = new Scanner(System.in);
        System.out.println("Enter the new combination ");
        String combo = sempai.nextLine();
        myLock.setCombination(combo);
        System.out.println();

        myLock.open();
        System.out.println(myLock);
        myLock.close();
        System.out.println(myLock);

    }
}
