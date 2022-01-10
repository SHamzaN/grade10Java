//package AP.ArrayList.Labs;
//import java.util.ArrayList;
//
//import java.util.ArrayList;
//
//public class Diet
//{
//    private ArrayList<Entry> list;
//
//    private int weightDifferential;
//    private int netWeightLossAndGain;
//
//    public Diet()
//    {
//        list = new ArrayList<Entry>();
//        weightDifferential = 0;
//        netWeightLossAndGain = 0;
//
//    }
//
//
//
//    public void addEntry(String d, int w)
//    {
//        list.add(new Entry(d,w));
//    }
//
//    public Entry getEntry(String date)
//    {
//
//        for (Entry entry: list)
//        {
//            if (entry.getEntryDate().equalsIgnoreCase(date))
//            {
//                return entry;
//            }
//        }
//        return null;
//    }
//
//    public void viewList()
//    {
//        System.out.println("   DATE     WEIGHT    DIFFERENCE");
//        System.out.println("------------------------------------");
//        weightDifferential = 0;
//        for (int i = 0; i < list.size();i++)
//        {
//            Entry date = list.get(i);
//            if(i == 0)
//            {
//                System.out.println(" " + date.getEntryDate() + "\t     " + date.getWeight() + "\t    " + weightDifferential);
//            }
//            else
//            {
//                weightDifferential = list.get(i).getWeight() - list.get(i - 1).getWeight();
//                netWeightLossAndGain += weightDifferential;
//                System.out.println(" " + date.getEntryDate() + "\t     " + date.getWeight() + "\t    " + weightDifferential);
//            }
//        }
//        System.out.println("-------------------------------");
//        System.out.println("Net Weight Loss/Gain = " + netWeightLossAndGain);
//        System.out.println("-------------------------------");
//        System.out.println();
//    }
//
//}
//
