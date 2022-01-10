package AP.Arrays;

public class Arrays104
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
        Arrays104 test = new Arrays104();

        System.out.print("Sum of the elements in the array: " + test.sum(nums));

    }

    public int sum(int[] ray)
    {
        int sum = 0;//Accumulator(return the total of all the elements)

        for(int i = 0; i < ray.length; i++)
            sum = ray[i];

        return sum;
    }

}
