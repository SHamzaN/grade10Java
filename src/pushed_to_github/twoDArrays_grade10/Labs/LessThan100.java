//package AP.twoDArrays.Labs;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class LessThan100
//{
//    private int rows;
//    private int columns;
//    private int[][] nums;
//    private boolean[][] less;
//
//    public void enterData()
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter matrix size-- >");
//        rows = scan.nextInt();
//        columns = scan.nextInt();
//    }
//
//    public void populaterandomMatrix()
//    {
//        nums = new int[rows][columns];
//        System.out.println("\nGenerated Matrix");
//        for(int i = 0; i < rows; i++)
//        {
//            for(int j = 0; j < columns; j++)
//            {
//                nums[i][j] = (int) (Math.random() * 201);
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//
//    public void numbersLessThan100()
//    {
//        less = new boolean[rows][columns];
//        System.out.println();
//        System.out.println("Numbers Less Than 100");
//        System.out.println();
//        System.out.print(" Row ");
//
//        System.out.println("        Column");
//
//        for (int i = 0; i < less.length; i ++)
//        {
//            for (int j = 0; j < less[i].length; j++)
//            {
//                if(nums[i][j] < 100)
//                {
//
//                    System.out.println("  " + i + "           " + j);
//                }
//            }
//
//        }
//    }
//
//    public String toString()
//    {
//        return " " ;
//    }
//
////    public static void main(String[] args)
////    {
////        LessThan100 lessThan100 = new LessThan100();
////        lessThan100.enterData();
////        lessThan100.populaterandomMatrix();
////        lessThan100.numbersLessThan100();
////
////
////
////    }
//
//}
