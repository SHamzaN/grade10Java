package AP_1.Recursion.Labs;
import java.util.*;

public class SongApp
{
    public static void main(String[] args)
    {
        SongTester s = new SongTester();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of bottles -->");
        int b = keyboard.nextInt();
        s.song(b);    // call to void method
        System.out.println();
        System.out.println();
    }
}

class SongTester
{
    public void song(int b)
    {
        if(b == 0)
        {

            return ;
        }
        else
        {
            System.out.println("\n" + b + " bottles of root beer on the wall.");
            System.out.println(b+ " bottles of root beer");
            System.out.println("Take one down, pass it around" );
            System.out.println( (b-1) + " bottles of root beer on the wall.");
            song(b-1);

        }

    }
}
