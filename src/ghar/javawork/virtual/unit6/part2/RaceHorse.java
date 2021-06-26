package ghar.javawork.virtual.unit6.part2;

public class RaceHorse extends Horse
{
    // instance variables
    private int numRacesWon;


    // Default constructor
    // Use the keyword super to call the Horse class's default
    //   constructor so that the instance variables inherited
    //   from this class can be initialized.
    // Initialize the instance variable numRacesWon to zero.
    public RaceHorse()
    {
        super();
        numRacesWon = 0;
    }

    // Second constructor
    // Use the keyword super to call the Horse class's second
    //   constructor so that the instance variables inherited
    //   from this class can be initialized to values specified
    //   in the parameter list.
    // Initialize the instance variable numRacesWon to the value
    //   specified in the parameter list.
    public RaceHorse(String owner, int age, double value, int races)
    {
        super(owner,age, value );
        numRacesWon = races;

    }

    // Accessor Method - getRacesWon
    // Return the number of races won by this horse
    public int getRacesWon()
    {
        return numRacesWon;
    }

    // Mutator Method - wonRace
    // Increment the number of races won attribute
    public void wonRace()
    {
        numRacesWon = numRacesWon + 1;

    }

    // toString method
    // Build and return a string representation of the instance
    // variables from both the Horse class and the RaceHorse class.
    // Use the keyword super to call the toString method of
    //   the Horse class then concatenate the numRacesWon attribute
    //   to the end to produce the output shown in the Sample
    //   Run.
    public String toString()
    {
        return super.toString() + "\n" + "Races won = " + numRacesWon;

    }

}