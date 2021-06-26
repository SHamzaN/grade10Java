package ghar.javawork.virtual.unit9;

public class ArrayFunHouse
{
    //instance variables and constructors could be used, but are not really needed

    //getSum() will return the sum of the numbers from start to stop, including stop
    public static int getSum(int[] numArray, int start, int stop)
    {
        int sum = 0;
        for(int i = start; i < numArray.length; i++){
            if (i <= stop){
              sum += numArray[i];
            }
        }

        return sum;
    }

    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val)
    {
        int times = 0;
        for (int i = 0; i < numArray.length; i++){
            if (i == val){
                times ++;
            }
        }
        return times;
    }


}