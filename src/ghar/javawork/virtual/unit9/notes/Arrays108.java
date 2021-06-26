package ghar.javawork.virtual.unit9.notes;
public class Arrays108{
    public static void main(String[] args){

        Arrays108 test = new Arrays108();
        int[] nums = {7,1,3,7,5,7,8,7,7,7};
        System.out.println("7 count: " + test.findSevens(nums));

    }
    public int findSevens(int[] mant){
        int count7 = 0;

        //  for(int i = 0; i<mant.length; i++)
        //   if(mant[i] == 7)
        //   count7++;

        for(int num : mant)
            if(num == 7)
                count7++;

        return count7;
    }
}