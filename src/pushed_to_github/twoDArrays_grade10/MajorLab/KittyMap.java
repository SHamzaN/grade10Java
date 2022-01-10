//package AP.twoDArrays.MajorLab;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class KittyMap
//{
//    private  boolean[][] kittyGrid;
//    int[][] matrix = new int[10][10];
//    /*
//     *this constructor loads in random true and false values
//     */
//    public KittyMap(int rows, int cols)
//    {
//        kittyGrid = new boolean[rows][cols];
//
//        for (int i = 0; i < rows; i++)
//        {
//            for (int j = 0; j < cols; j++)
//            {
//                int thirty = (int) (Math.random() * 10);
//                if (thirty <= 2) {
//
//                    kittyGrid[i][j] = true;
//                }
//                else
//                {
//                    kittyGrid[i][j] = false;
//                }
//
//            }
//        }
//    }
//
//    /*
//     *this method will call getKittyCount
//     *to retrieve the total count of kitties in the grid
//     */
//    public void printKittyCount()
//    {
//        System.out.println("There are " + getKittyCount(10, 10) + " kitties");
//
//    }
//
//    /*
//     *this method will calculate the kitty counts for each cell
//     *if cell is true set int value to 9
//     *if cell is not true set int value to cnt of kitties in adjacent cells
//     */
//    private int[][] getKittyCountsGrid()
//    {
//        int[][] matrix = new int[10][10];
//        int count = 0;
//        for (int i = 0; i < kittyGrid.length; i++)
//        {
//            for (int j = 0; j < kittyGrid[i].length; j++)
//            {
//                if (getKittyCount(i,j) == 9)
//                {
//                    matrix[i][j] = 9;
//                }
//
//                if (!inBounds(i,j-1))
//                {
//                    if(getKittyCount(i, j-1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i, j+1))
//                {
//                    if(getKittyCount(i, j+1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i-1, j))
//                {
//                    if(getKittyCount(i-1, j) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i+1, j))
//                {
//                    if(getKittyCount(i+1, j) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i-1, j-1))
//                {
//                    if(getKittyCount(i-1, j-1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i+1, j-1))
//                {
//                    if(getKittyCount(i+1, j-1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i-1, j+1))
//                {
//                    if(getKittyCount(i-1, j+1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!inBounds(i+1, j+1))
//                {
//                    if(getKittyCount(i+1, j+1) == 9)
//                    {
//                        count++;
//                    }
//                }
//
//                if(!(getKittyCount(i,j) == 9))
//                {
//                    matrix[i][j] = count;
//                }
//            }
//            count = 0;
//        }
//
//        return matrix;
//    }
//
//    /*
//     *This method will return the total count of kitties in the the grid
//     */
//    public int getKittyCount(int r, int c)
//    {
//        int count = 0;
//        for (int i = 0; i < r; i++)
//        {
//            for (int j = 0; j < c; j++)
//            {
//                if (kittyGrid[i][j] == true) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    /*
//     *check r and c to ensure they are inside the grid
//     */
//    private boolean inBounds(int r, int c)
//    {
//        if (r < 0)
//        {
//            return true;
//        }
//        if (c < 0)
//        {
//            return true;
//        }
//        return false;
//    }
//
//    /*
//     *return the kitty grid as a string
//     */
//    public String toString() {
//        String output = "";
//
//        for (int i = 0; i < kittyGrid.length; i++)
//        {
//            for (int j = 0; j < kittyGrid[i].length; j++)
//            {
//                if(kittyGrid[i][j])
//                {
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < kittyGrid.length; i++)
//        {
//            for (int j = 0; j < kittyGrid[i].length; j++)
//            {
//                if (kittyGrid[i][j])
//                {
//                    System.out.print("9 ");
//                }
//                else
//                {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//
//        }
//
//        return output.trim();
//    }
//}
