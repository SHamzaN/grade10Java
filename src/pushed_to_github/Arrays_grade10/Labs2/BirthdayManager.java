//package AP.Arrays.Labs2;
//
//import java.util.Scanner;
//
//public class BirthdayManager
//{
//   private Birthday[] birthdays;
//   private int num;
//
//   public BirthdayManager()
//   {
//       birthdays = new Birthday[50];
//       num = 0;
//   }
//
//    public void addBirthdays()
//    {
//        System.out.println("************************\n" +
//                "*     addBirthdays     *\n" +
//                "************************");
//        Scanner scan  = new Scanner(System.in);
//        String ans = "";
//        do {
//            System.out.print("Enter name --> ");
//            String name = scan.nextLine();
//            System.out.print("Enter Bday -->  ");
//            String bday = scan.nextLine();
//
//            birthdays[num] = new Birthday(name,bday);
//            num++;
//            System.out.println();
//            System.out.print("Enter Another[y/n]: ");
//            ans = scan.nextLine();
//            System.out.println();
//
//        }while (ans.equalsIgnoreCase("y"));
//
//    }
//
//    public void printBirthdays()
//    {
//        System.out.println("************************\n" +
//                "*    printBirthdays    *\n" +
//                "************************");
//        System.out.println();
//          for (int i = 0; i < num; i++)
//          {
//              System.out.println(birthdays[i]);
//              System.out.println();
//          }
//
//    }
//    public static void main(String[] args)
//    {
//        BirthdayManager app = new BirthdayManager();
//        app.addBirthdays();
//        app.printBirthdays();
//    }
//}
