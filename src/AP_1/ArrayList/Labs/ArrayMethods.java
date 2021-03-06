package AP.ArrayList.Labs;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayMethods
{
    // returns a String representation of a String array with one set of brackets[]surrounding// all of the elements and each element is delimited with a comma
     public String bracketFormat(String[] array)
     {
         return Arrays.toString(array);
     }
     // Sorts an array of integers using natual ordering
     public void sorter(int[] array)
     {
        Arrays.sort(array);
     }
     // Sorts an array of integers starting at startIndex and ending at endIndex
     public void sortPartial(int[] array, int startIndex, int endIndex)
     {
             Arrays.sort(array,startIndex,endIndex);
     }
     // sorts an int[] array to find the smallest value.
     // changes all of array's elements to the smallest value.
     public void allSmallestElement(int[] array)
     {
         Arrays.fill(array,
                 Arrays.stream(array).
                         min().
                         getAsInt()

         );

     }
         // searches an int array for parameter key and returns its index// if key is not in the array return the index of where it should// be located as a negative value minus 1
     public int find(int[] array, int key)
     {
         return Arrays.binarySearch(array,key);
     }
     // returns true if two given char arrays are equivalent
     public boolean areEquivalent(char[] array1, char[] array2)
     {
         if (Arrays.equals(array1, array2))
         {
          return true;
         }
         return false;
     }
     // returns an ArrayList containing all of the values of a given String array
     public ArrayList<String> toArrayList(String[] array)
     {
         ArrayList<String> list = new ArrayList<String>(List.of(array));
         return list;
     }
     public void printIntArray(int[] array)
     {
         for(int i = 0; i < array.length; i++)
             System.out.print(array[i] + " ");
     }
     public void printCharArray(char[] array)
    {
        for(int i = 0; i < array.length; i++)System.out.print(array[i] + " ");
    }
    public void printStringArray(String[] array)
    {
        for(int i = 0; i < array.length; i++)System.out.print(array[i] + " ");
    }
    public static void main(String[] args)
    {
        ArrayMethods app = new ArrayMethods();
        String[] uno = {"Are","we","there","yet?"};
        String[] dos = {"Arrays","class","is","wonderful!"};
        String[] tres = {"Don't","Worry,","be","happy!"};
        int[] one = {9,8,7,6,5,4,3,2,1};
        int[] two = {8,6,7,5,3,0,9};
        int[] three = {3,1,4,1,5,9,2,6};
        int[] four = {9,9,9,2,1,3,9,9,9};
        int[] five = {2,4,6,10,8,14,12};
        int[] six = {0,30,20,60,10,50,40,0};
        char[] wa = {'s','a','m','e'};
        char[] cha = {'S','A','M','E'};
        char[] wej = {'s','a','m','e'};
        System.out.println("*********************");
        System.out.println("   Bracket Format");
        System.out.println("*********************\n");
        System.out.println(app.bracketFormat(uno));
        System.out.println(app.bracketFormat(dos));
        System.out.println(app.bracketFormat(tres));
        System.out.println("\n*********************");
        System.out.println("       SORTER");
        System.out.println("*********************\n");
        System.out.print("UnSorted: ");
        app.printIntArray(one);
        System.out.print("\nSorted:   ");
        app.sorter(one);
        app.printIntArray(one);
        System.out.print("\n\nUnSorted: ");
        app.printIntArray(two);
        System.out.print("\nSorted:   ");
        app.sorter(two);
        app.printIntArray(two);
        System.out.print("\n\nUnSorted: ");
        app.printIntArray(three);
        System.out.print("\nSorted:   ");
        app.sorter(three);
        app.printIntArray(three);
        System.out.println("\n\n*********************");
        System.out.println("   PARTIAL SORTER");
        System.out.println("*********************\n");
        System.out.print("UnSorted: ");
        app.printIntArray(four);
        System.out.print("\nSorted:   ");
        app.sortPartial(four,3,5);
        app.printIntArray(four);
        System.out.print("\n\nUnSorted: ");
        app.printIntArray(five);
        System.out.print("\nSorted:   ");
        app.sortPartial(five,3,6);
        app.printIntArray(five);
        System.out.print("\n\nUnSorted: ");
        app.printIntArray(six);
        System.out.print("\nSorted:   ");
        app.sortPartial(six,1,7);
        app.printIntArray(six);
        System.out.println("\n\n*********************");
        System.out.println("   SMALLEST ELEMENT");
        System.out.println("*********************\n");
        app.allSmallestElement(one);
        app.printIntArray(one);
        System.out.println();
        app.allSmallestElement(two);
        app.printIntArray(two);
        System.out.println();
        app.allSmallestElement(three);
        app.printIntArray(three);
        System.out.println("\n\n*********************");
        System.out.println("        FIND");
        System.out.println("*********************\n");
        two[0] = 8;
        two[1] = 6;
        two[2] = 7;
        two[3] = 5;
        two[4] = 3;
        two[5] = 0;
        two[6] = 9;
        app.sorter(two);
        System.out.print("Array : ");
        app.printIntArray(two);
        System.out.println("\nSearching for : 0");
        System.out.println("Found at index : " + app.find(two,0));
        System.out.print("\nArray : ");
        app.printIntArray(two);
        System.out.println("\nSearching for : 5");
        System.out.println("Found at index : " + app.find(two,5));
        System.out.print("\nArray : ");   app.printIntArray(two);
        System.out.println("\nSearching for : 4");
        System.out.println("Found at index : " + app.find(two,4));
        System.out.println("Should be inserted at: " + (-app.find(two,4)-1));
        System.out.println("\n*********************");
        System.out.println("     ?EQUIVALENT?");
        System.out.println("*********************\n");
        System.out.print("Array wa: ");
        app.printCharArray(wa);
        System.out.print("\nArray cha: ");
        app.printCharArray(cha);
        System.out.println("\nArray wa is equivalent to Array cha :: " + app.areEquivalent(wa,cha));
        System.out.print("\nArray wa: ");
        app.printCharArray(wa);
        System.out.print("\nArray wej: ");
        app.printCharArray(wej);
        System.out.println("\nArray wa is equivalent to Array wej :: " + app.areEquivalent(wa,wej));
        System.out.println("\n*********************");
        System.out.println("     toARRAYLIST");
        System.out.println("*********************\n");
        System.out.print("Array: ");
        app.printStringArray(uno);
        System.out.print("\nArrayList: ");
        System.out.println(app.toArrayList(uno));
        System.out.print("\nArray: ");
        app.printStringArray(dos);
        System.out.print("\nArrayList: ");
        System.out.println(app.toArrayList(dos));
        System.out.print("\nArray: ");
        app.printStringArray(tres);
        System.out.print("\nArrayList: ");
        System.out.println(app.toArrayList(tres));
    }
}
