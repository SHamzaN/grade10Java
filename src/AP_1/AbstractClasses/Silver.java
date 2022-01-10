package AP_1.AbstractClasses;

public class Silver  extends Donation
{
    private String name;

    public Silver(String name)
    {
        super(name);
    }

    @Override
    public String getClub() {
        return "Silver";
    }

    @Override
    public double getAmount() {
        return 100.0;
    }
}