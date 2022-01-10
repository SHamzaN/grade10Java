package AP.ArrayList.Labs;

public class Entry
{
    private String entryDate;
    private int weight;

    public Entry()
    {
        entryDate = "";
        weight = 0;

    }

    public Entry(String e,int w)
    {
        entryDate = e;
        weight = w;
    }

    public String getEntryDate()
    {
        return entryDate;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setEntryDate(String entryDate)
    {
        this.entryDate = entryDate;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "";
    }
}
