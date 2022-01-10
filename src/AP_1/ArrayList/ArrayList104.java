package AP_1.ArrayList;

import java.util.ArrayList;

public class  ArrayList104
{

    public static void main(String[] args)
    {

//Method remove(index);

        ArrayList list = new ArrayList();

        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("The value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
        System.out.println("The value at index 2: " + list.get(2));

        list.remove(1);

        System.out.println("\nThe value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
//       System.out.println("The value at index 2: " + list.get(2));//index out of bounds exception

        list.add(2,88);
        //list.add(5,89);//Index out of bounds exception

        System.out.println("\nThe value at index 0: " + list.get(0));
        System.out.println("The value at index 1: " + list.get(1));
        System.out.println("The value at index 2: " + list.get(2));
    }

}

