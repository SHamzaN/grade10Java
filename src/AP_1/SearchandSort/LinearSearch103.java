package AP_1.SearchandSort;

import java.util.Arrays;

public class LinearSearch103
{

    public static void main(String[] args)
    {
//Linear search with objects

        String[] list = {"Thein", "Ethan", "Evie", "Sayyid", "Nolan", "Larissa"};

        int loc = -1;
        String key = "Evie";
        System.out.println("Elements checked:");

        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
            if(list[i].equals(key))
            {
                loc = i;
                break;
            }
        }


        System.out.println("\n\n" + Arrays.toString(list));

        if(loc > -1)
        {
            System.out.println("\nThe array contains " + key + " at index " + loc +"\n");

        }
        else
            System.out.println("\nThe array does not contain" + key + "\n");
    }
}

