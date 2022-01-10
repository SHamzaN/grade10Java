package AP_1.SearchandSort.Labs;

public class State implements Comparable
{
    // instance variables
    private String name;
    private String capital;
    private String nickname;
    private int population;

    public State(String n, String c, String nn, int p)
    {
        name = n;
        capital = c;
        nickname = nn;
        population = p;
    }

   // Comparable Interface method
   // Casts obj to a String, then calls the String class's
   // compareTo method to compare the name of this state
   // to the name passed in the parameter list. It returns
   // either a positive number, negative number, or zero.
   public int compareTo(Object obj)
   {
       String temp = (String) obj;

       if(name.equals(temp))
       {
           return 1;
       }
       else if(!name.equals(obj))
       {
           return -1;
       }
       return 0;

   }


   public String getName()
   {
      return name;
   }

   public String getCapital()
   {
      return capital;
   }

   public String getNickname()
   {
      return nickname;
   }

   public int getPopulation()
   {
      return population;
   }
}