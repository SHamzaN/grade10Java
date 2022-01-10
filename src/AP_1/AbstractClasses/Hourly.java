package AP_1.AbstractClasses;

public class Hourly extends Employee
{
    private double wage;
    private int hour;

    public Hourly(String n, String s, double w, int h)
    {
        super(n, s);
        wage = w;
        hour = h;

    }

    @Override
    public double getSalary()
    {
        if(hour > 160)
        {
            double extra = ((hour - 160) * (wage * 1.5));
            return extra + (wage * hour);
        }

        else
        return wage * hour;
    }
}