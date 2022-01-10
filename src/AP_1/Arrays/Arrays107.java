package AP.Arrays;


public class Arrays107
{

    public static void main(String[] args)
    {
// TODO Auto-generated method stub

        Arrays107 test = new Arrays107();
        int[] nums = {3,1,7,3,4,3,9,3,3};
        System.out.println("3 count: " + test.findThress(nums));

    }

    private int findThress(int[] mant)
    {
        int count3 = 0;//Counter
/*for(int i = 0; i < mant.length; i++)
{
if(mant[i] == 3)
{
count3++;
}
}*/

        for(int num : mant)
        {
            if(num == 3)
            {
                count3++;
            }
        }
        return count3;


    }
}

