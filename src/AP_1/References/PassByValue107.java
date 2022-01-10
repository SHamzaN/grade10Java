package AP_1.References;

import java.util.ArrayList;

public class PassByValue107
{
    public static void main(String[ ] args)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1); list.add(2); list.add(3);
        System.out.println("List Before: ");
        System.out.println(list);

        changeValues(list);


        System.out.println("\nList After: ");
        System.out.println(list);
    }

    public static void changeValues(ArrayList<Integer> alist)
    {
        alist = new ArrayList<Integer>();
        alist.add(4); alist.add(5); alist.add(6);
        System.out.println("\nList During: ");
        System.out.println(alist);
    }

}

