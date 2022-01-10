package AP_1.SearchandSort.Labs;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
public class NumberSearch
{
    public static int getNextLargest(int[] numArray, int searchNum)
    {

        int small = Integer.MAX_VALUE;

        for(int i = 0; i < numArray.length; i++)
        {
            if(numArray[i] > searchNum && small > numArray[i])
            {
                small = numArray[i];
            }
        }
        return small ;
    }
}
