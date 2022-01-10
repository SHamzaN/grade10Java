package AP_1.Recursion.Labs;

import static java.lang.System.*;
public class AtCounter
{
    private char[][] atMat;
    public AtCounter()
    {
        atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
                {'@','@','@','-','@','@','-','@','-','@'},
                {'-','-','-','-','-','-','-','@','@','@'},
                {'-','@','@','@','@','@','-','@','-','@'},
                {'-','@','-','@','-','@','-','@','-','@'},
                {'@','@','@','@','@','@','-','@','@','@'},
                {'-','@','-','@','-','@','-','-','-','@'},
                {'-','@','@','@','-','@','-','-','-','-'},
                {'-','@','-','@','-','@','-','@','@','@'},
                {'-','@','@','@','@','@','-','@','@','@'}};
    }
    public int countAts(int r, int c)
    {
//add in recursive code to count up the # of @s connected
//start checking at spot [r,c]
        if( (r > -1 && r < atMat.length && c > -1 && c < atMat[0].length) && atMat[r][c] == '@')
        {
            if( atMat[r][c] != '@')
            {
                return 0;
            }
              atMat[r][c] = '*';
              return 1 + countAts(r - 1, c) + countAts(r+1,c)
                       + countAts(r,c-1) + countAts(r, c+1)
                      + countAts(r - 1, c-1) + countAts(r+1,c+1)
                      + countAts(r-1,c+1) + countAts(r+1, c-1);
        }
        return 0;
    }
    /*
     *this method will return all values in the matrix
     *this method should return a view of the matrix
     *that looks like a matrix
     */
    public String toString()
    {
        String output = " ";

        int i = 0;
        while (i < atMat.length)
        {

            out.println(atMat[i]);
            i++;
        }

        return " " + output;
    }
}
