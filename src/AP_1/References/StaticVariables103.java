package AP_1.References;


public class StaticVariables103
{
    public static void main(String[] args)
    {
        Player player1 = new Player("Anakin") ;
        Player player2 = new Player("Rey") ;

        player1.gameResult(1000);
        System.out.println(player1 + "\n");

        player2.gameResult(500);
        System.out.println(player2 + "\n");

        player2.gameResult(1200);
        System.out.println(player2 + "\n");

        System.out.println(player1 + "\n");


    }
}

