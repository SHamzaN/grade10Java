package AP_1.SearchandSort.Labs;

import java.util.*;
import java.io.*;

public class UnitedStates
{
    // instance variables
    private State[] states;

    public UnitedStates()
    {
       states = new State[50];

       readFile();
       printStates();

       searchStates();
    }

    public void searchStates()
    {
        Scanner keyboard = new Scanner(System.in);
        String ans = "y";
        System.out.println();
        System.out.println("=====================");
        System.out.println("     Searching");
        System.out.println("=====================");

        while(ans.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.print("Enter state -->");
            String stateName = keyboard.nextLine();

            State state = binarySearch(stateName);

            if(state == null)
               System.out.println("State not found");
            else
            {
              System.out.println();
              System.out.println("State Name       = " + state.getName());
              System.out.println("State Capital    = " + state.getCapital());
              System.out.println("State Nickname   = " + state.getNickname());
              System.out.println("State Population = " + state.getPopulation());
              System.out.println();
            }

            System.out.println();
            System.out.print("Search again[Y/N]?");
            ans = keyboard.nextLine();
        }
    }

    // Performs a binarySearch on states searching for key
// If key is found it returns the State object that
// corresponds to key; otherwise it returns null
    public State binarySearch(String key)
    {
        int low = 0;
        int high = 50;

        while(high >= low)
        {
            int middle = (low + high) / 2;
            if(states[middle].getName().equals(key))
            {
                return states[middle];
            }
            if(states[middle].getName().compareTo(key) < 0)
            {
                low = middle + 1;
            }
            else if(states[middle].getName().compareTo(key) > 0)
            {
                high = middle - 1;
            }
        }
        return null;

    }

    public void printStates()
    {
        for(State s : states)
        {
            System.out.printf("%-15s", s.getName());
            System.out.printf("%-15s", s.getCapital());
            System.out.printf("%-25s", s.getNickname());
            System.out.printf("%10s\n", s.getPopulation());
        }
    }

    public void readFile()
    {
        Scanner scan = null;
        try
        {
                scan = new Scanner(new File("states.txt"));
        }
        catch(FileNotFoundException ex)
        {
                System.out.println("File not Found!");
        }

        String name;
        String capital;
        String nickname;
        int population;
        int count = 0;
        while(scan.hasNextLine())
        {
            name = scan.nextLine();
            capital = scan.nextLine();
            nickname = scan.nextLine();
            population = scan.nextInt();
            if(scan.hasNextLine())
            {
              String dummy = scan.nextLine();
            }

            State state = new State(name, capital, nickname, population);
            states[count] = state;
            count++;
        }
    }
}