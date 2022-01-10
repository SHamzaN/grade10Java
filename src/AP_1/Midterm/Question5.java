package AP_1.Midterm;

import java.util.ArrayList;

import static java.lang.System.out;

public class Question5
{
    public static void main(String[] args)
    {

        ArrayList<Integer> list;
        list = new ArrayList<Integer>();
        list.add(0,-55);
        list.add(1,-20);
        list.add(2,9);
        list.add(3,32);
        list.add(4,49);
        list.add(5,-30);
        list.add(6,-10);
        list.add(7,4);
        list.add(8,12);

        for(int i = 0; i < list.size(); i+=2)
            list.remove(i);
        out.println(list);
    }
}
