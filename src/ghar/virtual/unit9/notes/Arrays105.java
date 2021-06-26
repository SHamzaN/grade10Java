package ghar.javawork.virtual.unit9.notes;
//For each loop aka Enhanced For loop
import java.util.Arrays;
public class Arrays105{
    public static void main(String[] args){
        String[] names = new String[5];

        names[0] = "David";
        names[1] = "Irene";
        names[2] = "Madeline";
        names[3] = "Andrew";
        names[4] = "Dan-ahh";

        System.out.println("\nBasic For Loop");
        for(int i = 0; i<names.length; i++)
            System.out.print(names[i] + " ");

        System.out.println();

        System.out.println("\nEnhanced For Loop");
        for(String name: names)
            System.out.print(name + " ");

        System.out.println();

        System.out.println("\nPrinting array with toString");
        System.out.println(Arrays.toString(names));
    }
}