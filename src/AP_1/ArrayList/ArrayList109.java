package AP_1.ArrayList;

import java.util.ArrayList;

public class ArrayList109
{
    public static void main(String[] args)
    {
//ArrayList<Object> list = new ArrayList<Object>();//same ArrayList list = new ArrayList()

        ArrayList<Integer> list = new ArrayList<Integer>();//Use a wrapper class
        // Autoboxing and unboxing occur Only with wrapper classes

        //autoBoxing (primitive -> Object)
        list.add(1);
        list.add(2);

        System.out.println(list);

        list.add(0,3);
        System.out.println(list);

        //int              Integer        Integer
        int sum = list.get(0) + list.get(1); //unboxing (Object -> primitive)
        System.out.println("sum = " + sum);


    }
}

