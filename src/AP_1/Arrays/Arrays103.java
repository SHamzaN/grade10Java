package AP.Arrays;

public class Arrays103
{
    public static void main(String[] args)
    {
        int[] scores = {7,8,9,0,3,4,5,6,2,3};
//index         0,1,2,3,4,5,6,7,8,9

        System.out.println("The length of the array is: " + scores.length);
        System.out.println("But the highest index value is: " + (scores.length - 1) + "\n");

//Inefficent way of printing array elements
        System.out.print(scores[0] + " ");
        System.out.print(scores[1] + " ");
        System.out.print(scores[2] + " ");
        System.out.print(scores[3] + " ");
        System.out.print(scores[4] + " ");
        System.out.print(scores[5] + " ");
        System.out.print(scores[6] + " ");
        System.out.print(scores[7] + " ");
        System.out.print(scores[8] + " ");
        System.out.print(scores[9] + "\n");

//A better way
        for(int i = 0; i < scores.length; i++)
        {
            System.out.print(scores[i] + " ");
        }
    }

}
