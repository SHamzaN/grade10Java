//package AP.twoDArrays.Labs;
//
//import java.util.Iterator;
//
//public class StoreLargest
//{
//    private int[][] nums1 = new int[4][4];
//    private int[][] nums2 = new int[4][4];
//    private String matrix1;
//    private String matrix2;
//    private String matrix3;
//    private int[][] nums3 = new int[4][4];
//    public void populateMatrix()
//    {
//        for (int i = 0; i < nums1.length; i++)
//        {
//            for (int j = 0; j < nums1[0].length; j++)
//            {
//                nums1[i][j] = (int) (Math.random() * 10);
//                nums2[i][j] = (int) (Math.random() * 10);
//            }
//        }
//        matrix1 = printMatrix1();
//        matrix2 = printMatrix2();
//
//    }
//
//    public String printMatrix1() {
//        StringBuilder output = new StringBuilder();
//        for (int[] subcurrnetIndex : nums1)
//        {
//            for (int num : subcurrnetIndex)
//            {
//                output.append(num).append(" ");
//            }
//            output.append("\n");
//        }
//        return output.toString();
//    }
//
//    public String printMatrix2()
//    {
//        StringBuilder output = new StringBuilder();
//        for (int[] subcurrnetIndex : nums2)
//        {
//            for(int num : subcurrnetIndex)
//            {
//                output.append(num).append(" ");
//            }
//            output.append("\n");
//        }
//        return output.toString();
//    }
//
//
//    public void storeLargestElements()
//    {
//       for(int i = 0; i < nums1.length; i++)
//       {
//           for (int j = 0; j < nums2[i].length; j++)
//           {
//                  if(nums1[i][j] > nums2[i][j])
//                  {
//                     nums3[i][j] = nums1[i][j];
//                  }
//                  else
//                  {
//                      nums3[i][j] = nums2[i][j];
//                  }
//           }
//       }
//        matrix3 = printMatrix3();
//    }
//    public String printMatrix3()
//    {
//        StringBuilder output = new StringBuilder();
//        for (int[] subcurrnetIndex : nums3)
//        {
//            for (int num : subcurrnetIndex)
//            {
//                output.append(num).append(" ");
//            }
//            output.append("\n");
//        }
//        return output.toString();
//    }
//    @Override
//    public String toString() {
//        return "Matrix 1" + "\n"
//                + matrix1 + "\n"
//                + "Matrix 2" + "\n"
//                + matrix2 + "\n"
//                + "Largest Elements" + "\n"
//                + matrix3 + "\n";
//    }
//
////    public static void main(String[] args)
////    {
////        StoreLargest storeLargest = new StoreLargest();
////        storeLargest.populateMatrix();
////        storeLargest.storeLargestElements();
////        System.out.println(storeLargest);
////
////    }
//}
