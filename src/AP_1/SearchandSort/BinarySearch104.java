package AP_1.SearchandSort;

import java.util.ArrayList;

import java.util.Collections;

public class BinarySearch104
{

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(8);
        nums.add(5);
        nums.add(7);
        System.out.println("Unsorted: " + nums.toString());
        Collections.sort(nums);
        System.out.println("Sorted: " + nums.toString());
        int index = Collections.binarySearch(nums, 7);

        if(index > -1)
        {
            System.out.println("The item is at index: " + index);
        }

        else
        {
            System.out.println("The item is not in the list. " );
            System.out.println("The item shoud be placed at index " + Math.abs(index + 1));
        }
    }

}

