package ghar.javawork.virtual.unit6.part2;

public class Football extends SportsTeam
{
// instance variables
private int numTouchDowns;
private int numInterceptions;
    // first constructor
    public Football(String name)
    {
         super(name);

    }
    // second constructor
    public Football(String name, int gamesPlayed, int gamesWon, int gamesLost, int t, int f) {
         super(name,gamesPlayed, gamesWon, gamesLost);
         numTouchDowns = t;
         numInterceptions = f;
    }
    // accessor - getTouchDownsPerGame
// calculates and returns the touchdowns per game by
// dividing number of touchdowns by games played

    public double getTouchDownsPerGame() {
        return numTouchDowns / getGamesPlayed();
    }
    // accessor - getInterceptionsPerGame
// caculates and returns the interceptions per game by
// dividing number of interceptions by games played

    public double getInterceptionsPerGame()
    {
        return numInterceptions / getGamesPlayed();
    }
    // toString method
    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Number of Touchdowns = "  + numTouchDowns  + "\n" + "Number of Interceptions = "  + numInterceptions + "\n" +
                "Touchdowns Per Game = "  + getTouchDownsPerGame() + "\n" + "Interceptions Per Game = " + getInterceptionsPerGame();
    }
}
