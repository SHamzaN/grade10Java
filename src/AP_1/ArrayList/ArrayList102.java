package AP_1.ArrayList;

import java.util.ArrayList;

public class ArrayList102
{
    public static void main(String[] args)
    {
//Method set(index,value)
//array[index] = value


        ArrayList list = new ArrayList();

        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("The value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
        System.out.println("The value at index 2: " + list.get(2));

        list.set(0, 7);
        list.set(2, 9);

        System.out.println("\nThe value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
        System.out.println("The value at index 2: " + list.get(2));



    }

}

