package ghar.javawork.virtual.unit6.part2;

public class Baseball extends SportsTeam
{
// instance variables
    private int numHomeRuns;
    private  int numRBIs;
    private int numErrors;

    // default constructor
    public Baseball(String name)
    {
    super(name);

    }
    // second constructor
    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e)
    {
        super(name,gamesPlayed,gamesWon,gamesLost);
        numHomeRuns = h;
        numRBIs = r;
        numErrors = e;
    }
    // accessor method - getHomeRunsPerGame
// calculates and returns the homeruns per game by
// dividing number of homeruns by games played

    public double getHomeRunsPerGame()
    {
        return numHomeRuns / getGamesPlayed();
    }
    // accessor method - getRBIsPerGame
// calculates and returns the RBIs per game by
// dividing the number of RBIs by games played

    public double getRBIsPerGame()
    {
        return  numRBIs / getGamesPlayed();
    }
    // accessor method - getErrorsPerGame
// calculates and returns the errors per game by
// dividing the number of errors by games played

    public double getErrorsPerGame()
    {
        return numErrors / getGamesPlayed();
    }
    // toString method
    public String toString()
    {
        return super.toString() + "\n" + "Number of Homeruns = " + numHomeRuns + "\n" + "Number of RBI's = " + numRBIs + "\n" + "Number of Errors = " + numErrors + "\n" +
                "Homeruns Per Game = " + getHomeRunsPerGame() + "\n" + "RBIs Per Game = " + getRBIsPerGame() + "\n" + "Errors Per Game = " + getErrorsPerGame();

    }
}