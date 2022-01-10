package AP_1.Arrays.Labs2;

public class Player
{
    // instance variables
    private String playerName;
    private int ftm; // (free throws made)
    private int fta; //(free throws attempted)
    private int fg2m;//(2 point field goals made)
    private int fg2a;// (2 point field goals attempted)
    private int fg3m;//(3 point field goals made)
    private int fg3a; //(3 point field goals made)

    // constructors
    public Player(String playerName, int ftm, int fta,
                  int fgm2, int fga2, int fgm3, int fga3)
    {
        this.playerName = playerName;
        this.ftm = ftm;
        this.fta = fta;
        this.fg2m = fgm2;
        this.fg2a = fga2;
        this.fg3m = fgm3;
        this.fg3a = fga3;
    }

    // accessor methods
    public String getPlayerName()
    {
        return playerName;
    }

    public int getFtm()
    {
        return ftm;
    }

    public int getFta()
    {
        return fta;
    }

    public int getFg2m()
    {
        return fg2m;
    }

    public int getFg2a()
    {
        return fg2a;
    }

    public int getFg3m()
    {
        return fg3m;
    }

    public int getFg3a()
    {
        return fg3a;
    }
    // other methods
    public double getFTPercentage()
    {
        double FREE_THROW_PERCENTAGE =  ((double)ftm / fta) * 100;
        return FREE_THROW_PERCENTAGE;
    }

    public double getFG2Percentage()
    {
        double POINT_FIELDGOAL_PERCENTAGE2 = ((double)fg2m / fg2a) * 100;

        return POINT_FIELDGOAL_PERCENTAGE2;
    }

    public double getFG3Percentage()
    {
        double POINT_FIELDGOAL_PERCENTAGE3 = ((double)fg3m / fg3a) * 100;
        return  POINT_FIELDGOAL_PERCENTAGE3;
    }

    public int getPointsScored()
    {
        int POINTS_SCORED = ftm + fg2m * 2 + fg3m * 3;
        return POINTS_SCORED;
    }



}
