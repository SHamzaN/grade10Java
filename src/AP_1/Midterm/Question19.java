package AP_1.Midterm;

public class Question19
{
    public static void main(String[] args)
    {
        int[] sRay = {9,9,7,1,2,3,4,5,6,2,2,3,7,3};
        System.out.println( aplus(sRay) );
    }

    public static int aplus( int[] ray )
    {
        int stuff = 0;
        for(int i = 0; i<ray.length; i++)
            if(ray[i] % 2 == 0)
                stuff = stuff + ray[i];
            return stuff;
    }
}
