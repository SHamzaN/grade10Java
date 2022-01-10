package AP_1.SearchandSort;

import java.util.Arrays;

public class LinearSearch101
{

    public static void main(String[] args)
    {
//Linear search with primitives

        int[] nums = {3,1,4,1,5,9};

        boolean found  = false;

        int key = 4;

        System.out.println("Elements checked:");

        for(int i  = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
            if(nums[i] == key)
            {
                found = true;
                break;

            }
        }

        System.out.println("\n\n" + Arrays.toString(nums));

        if(found)
        {
            System.out.println("\nThe array contains " + key + "\n");

        }
        else
            System.out.println("\nThe array does not contain" + key + "\n");
    }

}

