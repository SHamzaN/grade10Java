package ghar.javawork.virtual.unit2.part1;
public class RandomRanges
{
    public static void main(String[] args)
    {
        //Create a random integer in the range of 0 to 25 inclusive.
        int num1 = ((int)(Math.random()* 25));

        //Create a random integer in the range of 1 to 3 inclusive.
        int num2 = ((int)(Math.random()* 3) + 1);

        //Create a random integer in the range of 50 to 100 inclusive.
        int num3 = ((int)(Math.random()* 51) + 50);

        //Create a random integer in the range of -10 to -1 inclusive.
        int num4 = ((int)(Math.random()* -10) -1);
        //Create a random integer in the range of -100 to 100 inclusive.
        int num5 = ((int)(Math.random()* 200) -100) ;
        //Create a random character in the range of A to Z. To do this first generate a random number in the range of 65(A) to 90(Z):
        int num6 = (int)(Math.random() * 26) + 65;


        //  double num7 = (double)(Math.random() * 1000) / 1000.0;
        // int num7 =(int)(Math.random) * 10000) + 1000);


        //Print output
        System.out.println("Random Ranges");
        //  System.out.println("\n");
        System.out.println("================");
        System.out.println("Range: 0 to 25 = " + num1);
        System.out.println("Range: 1 to 3 = " + num2);
        System.out.println("Range: 50 to 100 = " + num3);
        System.out.println("Range: -1 to -10 = " + num4);
        System.out.println("Range: -100 to 100 = " + num5);
        System.out.println("Range: A to Z = " + (char)num6);
        //  System.out.println("Range: 0.1 to 1 = " + num7);
        //  System.out.println("Range: 1000 to 10000 " + num7);





    }
}