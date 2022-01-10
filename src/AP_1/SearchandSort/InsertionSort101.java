package AP_1.SearchandSort;

import java.util.Arrays;

public class InsertionSort101
{

    public static void main(String[] args)
    {
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = (int)(Math.random() * 19) + 3;
        }
        System.out.println("Unsorted array : " + Arrays.toString(nums));


        for(int i = 1; i < nums.length; i++) //i = first index of unsorted array
        {

            int temp = nums[i];
            int j = i;
            while(j > 0 && temp < nums[j-1])
            {
                nums[j] = nums[j-1];// shift element to the  right
                j--;
            }

            nums[j] = temp; // insert element in array at index ;
        }

        System.out.println("\nSorted array : " + Arrays.toString(nums));
    }

}

