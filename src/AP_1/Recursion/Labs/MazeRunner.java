package AP_1.Recursion.Labs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner
{
    public static void main(String[] args) throws IOException
    {
        /*Instantiate Scanner named "file" here*/
        Scanner file = new Scanner(new File("maze.dat"));
        while(file.hasNext())
            /*hint: there's a method in the Scanner class
             *that returns true if there is more input.*/
        {
            int size = file.nextInt();
            file.nextLine(); //dummy read
            Maze test = new Maze(size, file.nextLine());
            test.checkForExitPath(0,0);
            System.out.println(test);
        }
    }
}
