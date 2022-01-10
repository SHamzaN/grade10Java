package AP_1.AbstractClasses;

public class Gold extends Donation
{
    private String name;

    public Gold(String name)
    {
        super(name);
    }

    @Override
    public String getClub() {
        return "Gold";
    }

    @Override
    public double getAmount() {
        return 500.0;
    }
}