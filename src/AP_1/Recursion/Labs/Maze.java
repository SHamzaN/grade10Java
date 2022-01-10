package AP_1.Recursion.Labs;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
public class Maze
{
    private int[][] maze;
    private boolean exitFound;
    public Maze(int size, String line)
    {
// instantiate maze 2d Array
        maze = new int[size][size];
// assign exitFound a value
        exitFound = false;
        Scanner chop = new Scanner(line);
        for(int r = 0; r < maze.length; r++)
            for(int c = 0; c < maze[r].length; c++)
                maze[r][c] = chop.nextInt();
    }
    public void checkForExitPath(int r, int c)
    {
        if ((r >-1 && r < maze.length && c >-1  && c < maze[0].length) && maze[r][c] == 1)
        {
            maze[r][c] = 0;
          if (c == maze[0].length-1)
          {
              exitFound = true;
          }
          else
          {

              checkForExitPath(r+1,c);
              checkForExitPath(r-1,c);
              checkForExitPath(r,c+1);
              checkForExitPath(r,c-1);

          }

        }
    }
    public String toString()
    {
        String output="";
        for (int[] ints : maze)
        {
            for (int c = 0; c < maze[0].length; c++)
            {
                output += ints[c];
            }
            output += "\n";
        }

        if(exitFound)
            output+="exit found";
        else
            output+="exit not found";
        return output;
    }
}