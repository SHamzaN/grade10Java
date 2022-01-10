package AP_1.Midterm;

import java.util.ArrayList;

public class Question10
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list;
        list = new ArrayList<Integer>();

        list.add(3);
        list.add(9);
        list.add(15);
        list.add(21);
        list.add(27);

        doStuff(list);
        System.out.println(list);
    }
    public static void doStuff(ArrayList<Integer> list)
    {
        for(Integer num: list)
            num += 5;

    }
}

