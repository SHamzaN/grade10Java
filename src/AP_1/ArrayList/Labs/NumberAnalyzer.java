package AP.ArrayList.Labs;

import java.util.ArrayList;

public class NumberAnalyzer
{
    private ArrayList<Number> list;


    public NumberAnalyzer()
    {
     list = new ArrayList<Number>();
    }

    public NumberAnalyzer(String numbers)
    {
        list = new ArrayList<>();

        String[] in = numbers.split(" ");
            for(String s : in){
                list.add(new Number(Integer.parseInt(s)));
            }
    }




    public void setList(String numbers)
    {

        list = new ArrayList<Number>();

        String[] in = numbers.split(" ");
        for(String s : in){
            list.add(new Number(Integer.parseInt(s)));
        }


    }

    public int countOdds()
    {
        int oddCount=0;
        for(int i = 0; i < list.size(); i++)
        {

            if(list.get(i).isOdd())
            {

                oddCount++;
            }
        }

        return oddCount;
    }

    public int countEvens()
    {
        int evenCount=0;
        for(int i = 0; i < list.size(); i++)
        {

            if(!list.get(i).isOdd())
            {

                evenCount++;
            }
        }

        return evenCount;
    }

    public int countPerfects()
    {
        int perfectCount=0;
        for(int i = 0; i < list.size(); i++)
        {

            if(list.get(i).isPerfect())
            {

                perfectCount++;
            }
        }

        return perfectCount;
    }
    public String toString( )
    {
        return "" + list;
    }
}
