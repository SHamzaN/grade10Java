package ghar.javawork.virtual.unit6.part2;

import java.util.Scanner;
public class CombinationLock extends Lock {
    private String combination;
    private Scanner scan;

    public CombinationLock(){
        super();
        combination = "";
        scan = new Scanner(System.in);
    }
    public CombinationLock(String combo){
        super();
        combination = combo;
        scan = new Scanner(System.in);
    }
    @Override
    public void open(){
        System.out.println("Enter the combination: ");
        String combo = scan.nextLine();
        if (combo.equals(combination));
        super.open();
    }
    public void setCombination(String combo){
        combination = combo;
    }
    public String getCombination(){
        return combination;
    }
    @Override
    public String toString(){
            return super.toString() + "\nCombination is: " + getCombination() + "\n";
    }

}
