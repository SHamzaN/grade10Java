package AP_1.AbstractClasses;

public class Platinum extends Donation
{
    private String name;

    public Platinum(String name)
    {
        super(name);
    }

    @Override
    public String getClub() {
        return "Platinum";
    }

    @Override
    public double getAmount() {
        return 1000.0;
    }
}