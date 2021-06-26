package ghar.javawork.virtual.unit9;
import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[20];
        for(int i = 0; i < 20; i++)
        {
            System.out.print("Num " + (i + 1) + " --> ");
            nums[i] = scan.nextInt();
        }
        System.out.println();

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 19; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }

}