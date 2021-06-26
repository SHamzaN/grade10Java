package ghar.javawork.virtual.unit9.notes;
public class Arrays107{
    public static void main(String[] args){

        Arrays107 test = new Arrays107();
        int[] nums = {1,2,3,4};
        System.out.println("Sum of the elements in the array: " + test.sum(nums));

    }
    public int sum(int[] rey){
        int sum = 0;

        //for(int i = 0; i<rey.length; i++)
        // sum += rey[i];

        for(int num : rey)
            sum += num;

        return sum;
    }
}