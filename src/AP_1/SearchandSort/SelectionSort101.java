package AP_1.SearchandSort;

import java.util.Arrays;

public class SelectionSort101
{
    public static void main(String[] args)
    {
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++)
        {

            nums[i] = (int)(Math.random() * 16) + 5;
        }
        System.out.println("Unsorted Array : " + Arrays.toString(nums));

        for(int i = 0; i < nums.length-1; i++) // i = first index of unsorted array
        {
            //find index of smallest element
            int min = i;
            //check unsorted portion of array for smallest element
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] < nums[min])
                    min = j; // new smallest number (recorded location)

            }
            if(min != i)
            {
                // swap : put smallest in position 'i' if not already in position 'i';
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}

