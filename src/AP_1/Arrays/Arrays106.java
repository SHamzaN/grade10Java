package AP.Arrays;


public class Arrays106
{

    public static void main(String[] args)
    {
// TODO Auto-generated method stub
        String[] names = new String[5];

        names[0] = "Daniel";
        names[1] = "Tuan";
        names[2] = "Evie";
        names[3] = "Larissa";
        names[4] = "Nathan";

        //Enhanced for loop aka (For Each Loop)

        System.out.println("\nEnhacned For Loop Before aka(For Each loop)");
        //for(declare a variable of the same data type as the array : array name)
        for(String name : names)
        {
            System.out.print(name + " "); //name == names[i]
        }

        //Attempting to change the elements with a enhanced for loop
        for(String x : names)
            x = "Dorks";

        //Enhanced for loop aka (For Each Loop)

        for(String name : names)
        {
            System.out.print(name + " "); //name == names[i]
        }
        System.out.println();

        //Attempting to change the elements with a basic for loop
        for(int i = 0; i<names.length; i++)
            names[i] = "Cracked";

        //Enhanced for loop aka (For Each Loop)

        System.out.println("\nEnhacned For Loop Before aka(For Each loop)");
        //for(declare a variable of the same data type as the array : array name)
        for(String name : names)
        {
            System.out.print(name + " "); //name == names[i]
        }


    }

}

