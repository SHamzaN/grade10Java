package ghar.javawork.virtual.unit9;

public class HighLow
{
    private double[] array = new double[10];
    private double[] below = new double[10];
    private double[] above = new double[10];

    /* This method populates array with random real numbers in the range
     * of 0-99 calculated to two decimal places.
     */
    public void populateArray()
    {

        for(int i = 0; i < array.length; i++){
            double num = ((int)(Math.random() * 10000)) / 100.0;
            array[i]=  num;

        }
    }

    /* This method calculates the average of the numbers stored in array.
     * @return the average
     */
    public double average()
    {
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total / array.length;
    }

    /* This method populates the below array with all the values in array
     * that are less than the average.
     * @return the logical size of below
     */
    public int populateBelow()
    {

        int count = 0;
            double average = average();
        for (int i = 0; i < array.length; i++){
            if (array[i] < average) {
             below[count] = array[i];
             count++;
            }

        }
        return count;
    }

    /* This method populates the above array with all the values in array
     * that are greater than the average.
     * @return the logical size of above
     */
    public int populateAbove()
    {
        double average = average();
        int count = 0;

        for (int i = 0; i < array.length; i++){
        if (array[i] > average) {
            above[count] = array[i];
            count++;
        }
    }
        return count;


    }

    /* Given an array and its logical size this method prints each number
     * in the array horizontally across the screen with a space between
     * each one.
     * @param list the array to be printed
     * @param size the logical size of the array
     */
    public void printArray(double[] list, int size)
    {    for (int i = 0; i < size; i ++){
        System.out.print(" " + list[i]);
    }


    }

    /* This method prints the summary report.
     */
    public void printSummary()
    {
        int lowestSize = populateBelow();
        int highestSize = populateAbove();

        System.out.print("Array = ");   // print original array
        printArray(array, array.length);
        System.out.println();

        System.out.println("Average = " + average());  //print average

        System.out.print("Below = ");     // print  below array
        printArray(below, lowestSize);
        System.out.println();

        System.out.print("Above = ");     // print above array
        printArray(above, highestSize);
        System.out.println();
    }

    public static void main(String[] args)
    {
        HighLow app = new HighLow();
        app.populateArray();
        app.printSummary();
    }
}
