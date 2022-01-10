package AP_1.SearchandSort;
import java.util.Arrays;

public class    BinarySearch102
{

    public static void main(String[] args)
    {

        String[] list = {"Thein", "Ethan", "Evie", "Sayyid", "Nolan", "Larissa"};

        System.out.println("Unsorted: " + Arrays.toString(list));

        Arrays.sort(list);

        System.out.println("Sorted: " + Arrays.toString(list));

        String key = "Nolan";
        int loc = -1;

        int min = 0;
        int max = list.length-1;

        System.out.println("\nElements checked: ");

        while(min <= max)
        {
            int mean = (min + max) / 2;
           System.out.print(list[mean] + " ");
            if(list[mean].equals(key))
            {
                loc = mean;
                break;
            }

            else
            if(list[mean].compareTo(key) > 0)
            {
                max = mean - 1;

            }
            else
                min = mean + 1;
        }

        if(loc > -1)
        {
            System.out.println("\nThe array contains " + key + " at index " + loc +"\n");

        }
        else
            System.out.println("\nThe array does not contain" + key + "\n");

    }
}
