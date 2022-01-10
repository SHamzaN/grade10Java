package AP_1.SearchandSort.Labs;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
public class NumberShifter
{
    public static int[] makeLucky7Array( int size)
    {
        int[] sevens = new int[size];

        for (int i = 0; i < sevens.length; i++)
        {
            sevens[i] = (int) (Math.random() * 10) + 1;
        }
        return sevens;
    }
    public static void shiftEm(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
              if(array[i] == 7)
              {
                 int swap = array[i];
                 array[i] = array[count];
                 array[count] = swap;
                 count++;
              }
        }
    }
}
