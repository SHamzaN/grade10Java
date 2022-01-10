package AP_1.Midterm;

import java.util.ArrayList;

public class Question7
{
    public static void main(String[] args)
    {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(0);
        lis.add(0);
        lis.add(0);
        lis.add(0);
        lis.add(0);

        for(int i = 0;i<lis.size();i++)
            lis.remove(i);System.out.println(lis);
    }
}
