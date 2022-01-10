package AP_1.References;



public class Student103
{
    /**Fields**/

    private String name;
    private double moneyCollected;

// private static double totalCollected;

    private static double totalCollected = 0;

    public Student103(String n)
    {
        name = n;
        moneyCollected = 0;
// totalCollected = 0; // Do not initialize static variables in a constructor
    }

    public void collectMoney(double amount)
    {
        moneyCollected += amount;
        totalCollected += amount;
    }

    @Override
    public String toString()
    {
        return "Name\t\t= " + name +
                "\nCollected\t= " + moneyCollected +
                "\nTotal Collected= " + totalCollected;
    }
}


