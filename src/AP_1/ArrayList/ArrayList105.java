package AP_1.ArrayList;

import java.util.ArrayList;

public class ArrayList105
{
    public static void main(String[] args)
    {

//return vs void

        ArrayList list = new ArrayList();


        System.out.println(list.add(" I"));
        System.out.println(list.add("Like"));
        System.out.println(list.add("Pie"));

        System.out.println("The value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
        System.out.println("The value at index 2: " + list.get(2));



        System.out.println("\n" + list.remove(1) + " was removed at index 1: ") ;

        System.out.println("\n the value at index 1: " + list.get(0));
    }
}


