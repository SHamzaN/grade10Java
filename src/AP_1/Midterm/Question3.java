package AP_1.Midterm;

import java.util.ArrayList;

public class Question3
{
    public static void main(String[] args)
    {
        ArrayList funList = new ArrayList();
        funList.add(0,"one");
        funList.add("two");
        funList.add(0,"three");
        funList.add("four");
        funList.add(0,"five");
        System.out.println( funList.indexOf("four") );
    }
}
