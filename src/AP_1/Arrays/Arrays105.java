package AP.Arrays;

import java.util.Arrays;
public class Arrays105
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

//Basic for loop
        System.out.println("\nBasic for loop");
        for(int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
        System.out.println();

        //Enhanced for loop aka (For Each Loop)

        System.out.println("\nEnhacned For Loop aka(For Each loop)");
        //for(declare a variable of the same data type as the array : array name)
        for(String name : names)
        {
            System.out.print(name + " "); //name == names[i]
        }

        System.out.println("\n\nDirectly Printing Array Object ");
        System.out.println(names);
        System.out.println();

        //Must import java.util.Arrays;
        System.out.println("\nPrint Array with toString(@param) from the Arrays class");
        //Because the toString methods are static use the class identifier "Arrays"
        System.out.println(Arrays.toString(names));
    }

}

