package ghar.javawork.virtual.unit7;

import java.util.Scanner;


public class Runner2
{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        String player = "";
        //add in a do while loop after you get the basics up and running
        RockPaperScissors game;
        do {

            System.out.print("Rock-Paper-Scissors -");
            System.out.print("type in your prompt [R,P,S] :: ");

            //read in the player value using scanner
            player = keyboard.nextLine();
            game = new RockPaperScissors();
            game.setPlayers(player);
            System.out.println(game);

            System.out.println("Do you want to play again ? y or n");
            response = keyboard.nextLine().charAt(0);

        } while (response == 'y');


        //call set players to assign players choice and randomly choose computers choice.
           game.setPlayers(player);

        //invoke the toString to see the game result.
        game.toString();


    }
}



