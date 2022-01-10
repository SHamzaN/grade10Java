//package AP.Arrays.Labs2;
//
//public class Numbers{
//    private int[] nums = new int[20];
//    private int[] positives = new int[20];
//    private int[] negatives = new int[20];
//    private int p = 0;                      // logical size of positives array
//    private int n = 0;                      // logical size of negatives array
//    /** precondition: none
//     *   postcondition: nums has been populated with random numbers
//     *     in the range of -100 to 100.
//     *      */
//    public void populateNums()
//    {
////        int min  = -100;
////        int max = 100;
//        for(int i = 0; i < nums.length; i++)
//        {
//            nums[i] = (int)(Math.random() * 201 ) - 100;
//        }
//    }
//    /** precondition: none
//     *  postcondition: positives has been populated with all the
//     *   numbers in nums that were positive. The variable p has
//     *      has been updated to reflect the logical size of
//     *      positives array.
//     *        */
//    public void populatePositives()
//    {
//        for(int i = 0; i < nums.length; i++)
//        {
//            if(nums[i] > 0)
//            {
//                positives[i] = nums[i];
//                p++;
//            }
//        }
//    }
//    /** precondition: none
//     *  postcondition: negatives has been populated with all the
//     *    numbers in nums that were negative. The variable n has
//     *    has been updated to reflect the logical size of
//     *     negatives array.
//     *        */
//    public void populateNegatives()
//    {
//        for(int i = 0; i < nums.length; i++)
//        {
//            if(nums[i] < 0)
//            {
//                negatives[i] = nums[i];
//                n++;
//            }
//        }
//    }
//    /** precondition: size >=0
//     * postcondition: all the values of array have been printed
//     *   from index 0 to the logical size of the array.
//     *    @param array the array to be printed.
//     *   @param size the logical size of array
//     *     */
//    public String print(int[] array, int size)
//    {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < size; i++) {
//            if (array[i] != 0) {
//                stringBuilder.append(array[i]).append(" " );
//            }
//        }
//       return stringBuilder.toString();
////        String string = " ";
////        for(int i = 0; i < size; i++)
////        {
////            if (array[i] != 0) {
////                string += array[i] + " ";
////            }
////        }
////        return string;
//    }
//
//    /** precondition: none
//     *  postcondition: all three arrays have been printed with
//     *  appropriate labelling.
//     *   */
//
//
//    public String toString()
//    {
//        return "Random Numbers = " + nums.length +
//                "\n========================" +
//                "\n" + print(nums, nums.length) +
//                "\n" +
//                "\nPositive Numbers = " + p +
//                "\n======================" +
//                "\n" + print(positives, positives.length) +
//                "\n" +
//                "\nNegative Numbers = " + n +
//                "\n======================" +
//                "\n" + print(negatives, negatives.length);
//     }
//
//    public static void main(String[] args)
//    {
//        Numbers app = new Numbers();
//        app.populateNums();
//        app.populatePositives();
//        app.populateNegatives();
//        System.out.println(app);
//    }
//}
