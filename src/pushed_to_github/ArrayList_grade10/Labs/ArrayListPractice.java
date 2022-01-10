//package AP.ArrayList.Labs;
//
//
//import java.util.*;      // needed for ArrayList
//
//public class ArrayListPractice
//{
//    static Scanner keyboard = new Scanner(System.in);
//
//    public static void main(String[] args)
//    {
//        System.out.println("Method 1");
//        System.out.println("--------");
//        System.out.println();
//        Method1();
//        System.out.println();
//        System.out.println("Method 2");
//        System.out.println("--------");
//        System.out.println();
//        Method2();
//    }
//
//    public static void Method1()
//    {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//
//        for(int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i) + " ");
//        }
//        System.out.println();
//
//        for(Object x : list )
//        {
//            System.out.println(x);
//        }
//
//    }
//
//    public static void Method2()
//    {
//        ArrayList<String> list = new ArrayList<String>();
//
//
//        String ans = "";
//        System.out.println("Enter words - type exit when finished. ");
//        System.out.println();
//
//        while(!ans.equalsIgnoreCase("exit"))
//        {
//
//            System.out.print("Enter a word --> ");
//            ans = keyboard.nextLine();
//
//            if(!ans.equalsIgnoreCase("exit"))
//            {
//                list.add(ans);
//            }
//
//
//        }
//        System.out.println();
//        for(int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i) + " ");
//        }
//
//        System.out.println();
//
//        for(Object x : list )
//        {
//            System.out.println(x);
//        }
//    }
//
//    public String toString()
//    {
//        String output = "";
//
//
//        return output;
//    }
//}
