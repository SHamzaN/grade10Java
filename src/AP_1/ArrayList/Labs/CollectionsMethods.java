package AP.ArrayList.Labs;

import java.util.ArrayList;
import java.util.Collections;
public class CollectionsMethods
{
    // Sorts an ArrayList of integer using natural ordering
    public void sorter(ArrayList<Integer> aList)
    {
            Collections.sort(aList);
    }
    // sorts an Integer ArrayList aList to find the smallest value.
    // changes all of aLists elements to the smallest value.
    public void allSmallestElement(ArrayList<Integer> aList)
    {
            Collections.fill(aList, Collections.min(aList));
    }
    // searches an integer ArrayList for parameter key and returns its index
    // if key is not in the ArrayList return the index of where it should
    // be located as a negative value minus 1
    public int find(ArrayList<Integer> aList, int key)
    {

        return Collections.binarySearch(aList,key);
    }
    // reverses the elements of an ArrayList type String
    public void changeDirection(ArrayList<String> aList)
    {
       Collections.reverse(aList);
    }
    // moves elements in the ArrayList to the right.
    // the elements will be moved parameter over times.
    public void shift(ArrayList<Integer> aList, int over)
    {

    }
    // takes all elements of the Arraylist parameter aList
    // and randomly places them in the ArrayList
    public void permutate(ArrayList<Integer> aList)
    {
         Collections.shuffle(aList);
    }
    public static void main(String[] args){
        CollectionsMethods app = new CollectionsMethods();
        ArrayList<String> uno = new ArrayList<String>();
        ArrayList<String> dos = new ArrayList<String>();
        ArrayList<String> tres = new ArrayList<String>();
        uno.add("Are");
        uno.add("we");
        uno.add("there");
        uno.add("yet?");
        dos.add("Collections");
        dos.add("class");
        dos.add("rocks");
        dos.add("my");
        dos.add("World!");
        tres.add("Don't");
        tres.add("Worry,");
        tres.add("be");
        tres.add("Happy!");
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        for(int i = 9; i > 0; i--) one.add(i);
        two.add(8);
        two.add(6);
        two.add(7);
        two.add(5);
        two.add(3);
        two.add(0);
        two.add(9);
        three.add(3);
        three.add(1);
        three.add(4);
        three.add(1);
        three.add(5);
        three.add(9);
        three.add(2);
        three.add(6);
        System.out.println("\n*********************");
        System.out.println("       SORTER");
        System.out.println("*********************\n");
        System.out.println("UnSorted: " + one);
        app.sorter(one);
        System.out.println("Sorted:   " + one);
        System.out.println("\nUnSorted: " + two);
        app.sorter(two);
        System.out.println("Sorted:   " + two);
        System.out.println("\nUnSorted: " + three);
        app.sorter(three);
        System.out.println("Sorted:   " + three);
        System.out.println("\n\n*********************");
        System.out.println("   SMALLEST ELEMENT");
        System.out.println("*********************\n");
        app.allSmallestElement(one);
        System.out.println(one);
        System.out.println();
        app.allSmallestElement(two);
        System.out.println(two);
       System.out.println();
       app.allSmallestElement(three);
       System.out.println(three);
       two.set(0,8);
       two.set(1,6);
       two.set(2,7);
       two.set(3,5);
       two.set(4,3);
       two.set(5,0);
       two.set(6,9);
       app.sorter(two);
       System.out.println("\n\n*********************");
       System.out.println("        FIND");
       System.out.println("*********************\n");
       System.out.println("ArrayList : " + two);
       System.out.println("\nSearching for : 0");
       System.out.println("Found at index : " + app.find(two,0));
       System.out.println("ArrayList : " + two);
       System.out.println("\nSearching for : 5");
       System.out.println("Found at index : " + app.find(two,5));
       System.out.println("ArrayList : " + two);
       System.out.println("\nSearching for : 4");
       System.out.println("Found at index : " + app.find(two,4));
       System.out.println("Should be inserted at: " + (-app.find(two,4)-1));
       System.out.println("\n\n*********************");
       System.out.println("   CHANGE DIRECTION");
       System.out.println("*********************\n");
       System.out.println("ArrayList : " + uno);
       app.changeDirection(uno);
       System.out.println("Reversed : " + uno);
       System.out.println("\nArrayList : " + dos);
       app.changeDirection(dos);
       System.out.println("Reversed : " + dos);
       System.out.println("\nArrayList : " + tres);
       app.changeDirection(tres);
       System.out.println("Reversed : " + tres);
       int count = 0;
       for(int i = 1; i <= one.size(); i++) one.set(count++,i);
       System.out.println("\n\n*********************");
       System.out.println("    Right Shift");
       System.out.println("*********************\n");
       System.out.println("ArrayList : " + one);
       app.shift(one,3);
       System.out.println("Shifted by 3 : " + one);
       System.out.println("\nArrayList : " + one);
       app.shift(one,1);
       System.out.println("Shifted by 1: " + one);
       System.out.println("\nArrayList : " + one);
       app.shift(one,8);
       System.out.println("Shifted by 8 : " + one);
       three.set(0,3);
       three.set(1,1);
       three.set(2,4);
       three.set(3,1);
       three.set(4,5);
       three.set(5,9);
       three.set(6,6);
       three.set(7,2);
       System.out.println("\n\n*********************");
       System.out.println("    Permutation");
       System.out.println("*********************\n");
       System.out.println("Original ArrayList : " + three);
       System.out.println();
       app.permutate(three);
       System.out.println("Permuatation 1 : " + three);
       app.permutate(three);   System.out.println("Permuatation 2 : " + three);
       app.permutate(three);       System.out.println("Permuatation 3 : " + three);
       System.out.println();
    }
}
