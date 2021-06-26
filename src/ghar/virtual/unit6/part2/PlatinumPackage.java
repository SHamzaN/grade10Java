package ghar.javawork.virtual.unit6.part2;

public class PlatinumPackage extends PremiumPackage
{
    public PlatinumPackage(int nights)
    {
        super(nights);
    }
    @Override
    public String getResort()
    {

        return "Spa Spectacular Resort";
    }
    @Override
    public double getCostPerNight()
    {
        return 200.00;
    }

    public String getMealPlan()
    {
        return "Breakfast, Lunch, and Dinner";
    }
}
