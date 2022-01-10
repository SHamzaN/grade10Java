package AP_1.References;


public class Player
{
    private String name;

    private int score;

    private static int highScore = 0;

    public Player(String n)
    {
        name = n;
        score = 0;
    }

    public void gameResult(int s)
    {
        if(s > score)
            score = s;

        if(s > highScore)
        {
            highScore = s;
        }
    }

    @Override
    public String toString()
    {
        return "Name:\t\t" + name +
                "\nPersonal Best:\t" + score +
                "\nHigh score:\t" + highScore;
    }
}



