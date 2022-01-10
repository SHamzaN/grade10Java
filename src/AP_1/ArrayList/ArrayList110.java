package AP_1.ArrayList;

import java.util.ArrayList;

public class ArrayList110
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= 9; i++)

            list.add(i);

        System.out.println(list);

//   for(int i  = 0; i >= list.size(); i++)
//   {
//   if(list.get(i) >= 4 && list.get(i) <= 6)
//                {
//   //list.remove(i);
//                   // i--:
//   list.remove(3);
//                }
//
//   }

        for(int i = list.size()-1; i > 0; i--)
        {
            if(list.get(i) >= 4 && list.get(i) <= 7)
            {
                list.remove(i);
            }

        }
        System.out.println(list );

    }
}

