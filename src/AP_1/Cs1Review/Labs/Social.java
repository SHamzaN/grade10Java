package AP_1.Cs1Review.Labs;


import java.util.Scanner;

import static java.lang.System.*;
    public class Social
    {
    private String socialNum;
    private int sum;
    public Social()
    {
      socialNum = " ";
      sum = 0;
    }
     public Social(String soc)
   {
     this.socialNum = soc;
   }
    public void setWord(String w)
    {
     socialNum = w;
    }
    public void chopAndAdd()
    {
          Scanner keyboard = new Scanner(System.in);
        String sub1,sub2,sub3;
        int int1, int2,int3;
        String sub = socialNum;
        out.println("Enter a SS#");
        sub = keyboard.nextLine();

         sub1 = sub.substring(0, sub.indexOf("-"));
         sub2 = sub.substring(sub1.length(), sub.lastIndexOf("-")).substring(1);
         sub3 = sub.substring(sub.lastIndexOf("-") ).substring(1);

         int1 = Integer.parseInt(sub1);
         int2 = Integer.parseInt(sub2);
         int3 = Integer.parseInt(sub3);

         sum = int1 + int2 + int3;
    }
    public String toString()
     {
    return "SS# " + socialNum + " has a total of " + sum + "\n";
     }
}