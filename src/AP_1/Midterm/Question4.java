package AP_1.Midterm;

import java.util.ArrayList;

public class Question4
{
    public static void main(String[] args)
    {

       ArrayList<String> all = new ArrayList<String>();
       all.add(0, "one");
        all.add(1, "two");
        all.add(2, "one");
        all.add(3, "five");
        all.add(4, "nine");
        all.add(5, "one");
        all.add(6, "one");
        all.add(7, "three");
        all.add(8, "one");
        all.add(9, "ten");
        removeAllOnes(all);
        System.out.println(all);
    }

    public static void removeAllOnes(ArrayList<String> all)
    {
        for(int spot = 0; spot < all.size(); spot++)
        {
        if( all.get(spot).equals("one") )
            all.remove(spot);
        }

    }
}
