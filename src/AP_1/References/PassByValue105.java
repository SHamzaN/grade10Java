package AP_1.References;

import java.util.Arrays;

public class PassByValue105
{
    public static void main(String[] args)
    {
        int[] mant = {1,2,3};
        System.out.println("Array Before: ");
        System.out.println(Arrays.toString(mant));

        changeValues(mant);

        System.out.println("\nArray After: " );
        System.out.println(Arrays.toString(mant));
    }


    public static void changeValues(int[] array)
    {
        array = new int[3]; array[0] = 4; array[1] = 5; array[2] = 6;
        System.out.println("\nArray During:");
        System.out.println(Arrays.toString(array));
    }
}

