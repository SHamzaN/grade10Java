package AP_1.Midterm;

import java.util.ArrayList;
import java.util.Collections;

public class Question2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list;
        list = new ArrayList<Integer>();
        list.add(8);
        list.add(2);
        list.set(0,7);
        list.add(1,9);
        Collections.sort(list);
        list.remove(0);
        System.out.println(list);
    }
}
