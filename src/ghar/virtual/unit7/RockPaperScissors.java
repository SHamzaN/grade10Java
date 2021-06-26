package ghar.javawork.virtual.unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors()
    {
        playChoice = "";
        compChoice = "";
    }

    public RockPaperScissors(String player)
    {
      playChoice = player;
    }

    public void setPlayers(String player)
    {
        playChoice = player;
        out.println("player had " + playChoice);

        double random = Math.random() * 2;
        int num = (int) random;

        switch (num){
            case 0:
                compChoice = "R";
                out.println("computer had " + compChoice);
                break;
            case 1:
                compChoice = "P";
                out.println("computer had " + compChoice);
                break;
            case 2:
                compChoice = "S";
                out.println("computer had " + compChoice);
                break;
        }
    }

    public String determineWinner() //this method should be called in the toString.
    {

        String winner="";

        if(compChoice.charAt(0) == 'P' && playChoice.charAt(0) == 'R'){
            winner = "!Computer wines <<Paper Covers Rock>>!";
        }else if(compChoice.charAt(0) == 'P' && playChoice.charAt(0) == 'S') {
            winner = "!Player wins <<Scissors Cuts Paper>>!";
        }else if(compChoice.charAt(0) == 'P' && playChoice.charAt(0) == 'P') {
            winner = "!Draw Game!";
        }else if(compChoice.charAt(0) == 'R' && playChoice.charAt(0) == 'R') {
            winner = "!Draw Game!";
        }else if(compChoice.charAt(0) == 'R' && playChoice.charAt(0) == 'S') {
            winner = "!Computer wins <<Rock Breaks Scissors>>!";
        }else if(compChoice.charAt(0) == 'R' && playChoice.charAt(0) == 'P') {
            winner = "!Player wins <<Paper Covers Rock>>! ";
        }else if(compChoice.charAt(0) == 'S' && playChoice.charAt(0) == 'R') {
            winner = "!Player wins <<Rock Breaks Scissors>>!";
        }else if(compChoice.charAt(0) == 'S' && playChoice.charAt(0) == 'S') {
            winner = "!Draw Game!";
        }else if(compChoice.charAt(0) == 'S' && playChoice.charAt(0) == 'P') {
            winner = "!Computer wins <<Scissors Cuts Paper>>!";
        }


     return winner;
    }

    public String toString()
    {

        String output="";
        output = determineWinner();
        return output;
    }
}