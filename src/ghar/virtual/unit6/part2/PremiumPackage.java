package ghar.javawork.virtual.unit6.part2;

public class PremiumPackage extends StandardPackage
{
    public PremiumPackage(int nights)
    {
        super(nights);
        nights = nights;
    }
    @Override
    public String getResort()
    {
        return "Carribean Resort";
    }
    @Override
    public double getCostPerNight()
    {
        return  150.00;

    }

    public String getMealPlan()
    {
        return "Breakfast";

    }

    public String toString()
    {
        return super.toString() + "\n" +
                "Meal Plan        = " + getMealPlan();
    }
}
