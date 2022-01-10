package AP_1.AbstractClasses;

public class Salary extends Employee
{

    private String name;
    private String ss;
    private double yearlysalary;

    public Salary(String n, String s, double sl)
    {
        super(n,s);
        yearlysalary = sl;

    }

    @Override
    public double getSalary()
    {
        return yearlysalary / 12;
    }
}