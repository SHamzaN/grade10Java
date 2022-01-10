//package AP.Cs1Review.Labs;
//
//import java.util.Scanner;
//
//
//public class UILCompSci
//{
//    private  int questions = 40;
//
//    private String name;
//    private int correct;
//    private int incorrect;
//    private int skips;
//    private int score;
//
//    private Scanner scan = new Scanner(System.in);
//
//
//    public UILCompSci(String n, int c, int i)
//    {
//        this.name = n;
//        this.correct = c;
//        this.incorrect = i;
//
//    }
////    public String name()
////    {
////       System.out.print("Enter contestant's name --> ");
////       // name = "Enter contestant's name --> ";
////        //Utility.readString(name);
////        name = scan.nextLine();
////        return name;
////    }
////
////   public int correct()
////   {
////       System.out.print("Number correct --> ");
////       correct = scan.nextInt();
////       return correct;
////
////   }
////  public int incorrect()
////  {
////      System.out.print("Number incorrect --> ");
////      incorrect = scan.nextInt();
////      return incorrect;
////  }
//
//    public int skips()
//    {
//       skips = questions - correct - incorrect;
//
//       return skips;
//
//    }
//
//     public int score()
//     {
//       score = (6 * correct) + (-2 * incorrect);
//       return score;
//     }
//
//
//    @Override
//    public String toString()
//    {
//        return "\nContestant's Name : "  + name+
//                "\nCorrect           : " + correct +
//                "\nIncorrect         : " + incorrect +
//                "\nSkips             : " + skips() +
//                "\n------------------------------" +
//                "\nScore             : " + score();
//    }
//
//    public static void main(String[] arsg)
//    {
//        String name = Utility.readString("Enter contestant's name -->");
//        int c = Utility.readInt("Number correct --> ");
//        int i = Utility.readInt("Number incorrect --> ");
//        UILCompSci uilCompSci = new UILCompSci(name,c,i);
//        System.out.println(uilCompSci);
//
//    }
//
//}
