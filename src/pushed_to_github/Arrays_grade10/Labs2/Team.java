//package AP.Arrays.Labs2;
//
//import java.util.*;
//
//public class Team
//{
//    // instance variables
//    private Player[] players;
//    private int num;
//
//    // constructor
//    public Team()
//    {
//        players = new Player[20];
//        num = 0;
//    }
//
//    /* This method allows a user to input up to 20 basketball players and
//     *  stores them in an array.
//     */
//    public void addPlayers()
//    {
//        String ans = "";
//        System.out.println("************************\n" +
//                "*      addPlayers      *\n" +
//                "************************");
//        Scanner keyboard = new Scanner(System.in);
//        do {
//            System.out.print("Enter player name--> ");
//            String name = keyboard.nextLine();
//            System.out.print("Enter free throws made --> ");
//            int ftm = keyboard.nextInt();
//            System.out.print("Enter free throws attempted --> ");
//            int fta = keyboard.nextInt();
//            System.out.print("Enter 2 pt field goals made --> ");
//            int ft2m = keyboard.nextInt();
//            System.out.print("Enter 2 pt field goals attempted --> ");
//            int ft2a = keyboard.nextInt();
//            System.out.print("Enter 3 pt fields goals made --> ");
//            int ft3m = keyboard.nextInt();
//            System.out.print("Enter 3 pt field goals attempted --> ");
//            int ft3a = keyboard.nextInt();
//            keyboard.nextLine();
//
//            players[num] = new Player(name, ftm, fta,ft2m,ft2a,ft3m,ft3a);
//            num = num+1;
//            System.out.println();
//            System.out.print("Enter another player[y/n]: ");
//            ans = keyboard.nextLine();
//            System.out.println();
//
//        }while (ans.equalsIgnoreCase("y"));
//
//    }
//
//    /* This method displays each Player in the array
//     */
//    public void printPlayers()
//    {
//        System.out.println("************************\n" +
//                "*     printPlayers     *\n" +
//                "************************");
//        for (int i = 0; i < num; i++)
//        {
//            System.out.println("Name = " + players[i].getPlayerName());
//            System.out.println("Free Throws % = " + players[i].getFTPercentage());
//            System.out.println("2 pt Field Goal % = " + players[i].getFG2Percentage());
//            System.out.println("3 pt Field Goal % = " + players[i].getFG3Percentage());
//            System.out.println("Total Points Scored = " + players[i].getPointsScored());
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        Team app = new Team();
//        app.addPlayers();
//        app.printPlayers();
//    }
//}