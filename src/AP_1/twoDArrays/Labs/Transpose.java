package AP.twoDArrays.Labs;
import java.util.Scanner;
public class Transpose
{
    private int rows;
    private int columns;
    private int[][] nums;
    private int[][] transpose;



    public void enterData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows-->");
        rows = scan.nextInt();
        System.out.print("Enter number of columns-->");
        columns = scan.nextInt();
    }
    public void populaterandomMatrix()
    {
        nums = new int[rows][columns];
        System.out.println();
        System.out.println("\nOriginal Matrix");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                nums[i][j] = (int) (Math.random() * 201) - 100;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void populateTranspose()
    {
        System.out.println();
        System.out.println("Transpose");
        transpose = new int[columns][rows];

        for(int i = 0; i < columns; i++)
        {
            for(int j = 0; j < rows; j++)
            {
                transpose[i][j] = nums[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public String toString()
    {
        return "";
    }
//
//    public static void main(String[] args)
//    {
//        Transpose transpose = new Transpose();
//        transpose.enterData();
//        transpose.populaterandomMatrix();
//        transpose.populateTranspose();
//
//
//    }
}
