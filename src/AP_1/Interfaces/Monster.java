package AP_1.Interfaces;


import static java.lang.System.*;
public class Monster
{
    private String name;
    private int howBig;
    public Monster()
    {
        name = "";
        howBig = 0;
    }

    public Monster(String n, int size)
    {
        name = n;
        howBig = size;
    }
    public String getName()
    {
        return name;
    }

    public int getHowBig()
    {
        return howBig;
    }

    public boolean isBigger(Monster other)
    {

      if(getHowBig() > other.getHowBig())
      {
          return true;
      }
        return false;
    }
    public boolean isSmaller(Monster other)
    { //call isBigger() use !
        if (!isBigger(other))
        {
            return true;
        }

        return false;
    }

    public boolean namesTheSame(Monster other)
    {

        if(getName().equalsIgnoreCase(other.getName()))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "Monster 1 - " + getName() + "" + getHowBig() +
                "Monster 2 - " + getName() + "" + getHowBig();
    }
}

