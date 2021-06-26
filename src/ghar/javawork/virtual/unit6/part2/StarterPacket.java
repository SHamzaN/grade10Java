package ghar.javawork.virtual.unit6.part2;

public class StarterPacket
{
    // instance variables
    private int photo8x10;

    // constructor
    public StarterPacket()
    {
        photo8x10 = 1;
    }

    public String getPacketName()
    {
        return "StarterPlan";
    }

    public String toString()
    {
        return getPacketName() + "\n" +
                "8 x 10 = " + photo8x10;
    }
}
