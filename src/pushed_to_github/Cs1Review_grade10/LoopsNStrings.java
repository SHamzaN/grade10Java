//package AP.Cs1Review;
//import java.util.Scanner;
//
//public class LoopsNStrings
//{
//    public void countToTwenty(int startingNumber)
//    {
//        System.out.print("\nFor loop: ");
//
//// for(start; stop (aka boolean conditional); increment/decrement)
//// as long as the boolean conditional is true, the loop will keep running
//
//        for(int i = startingNumber; i <= 20; i++)
//        {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n");
//    }
//
//    public void printNumbers(int maxNumber)
//    {
//        System.out.print("\nWhile Loop: ");
//
//        int num = 1; //loop control variable
//
////while(boolean conditional)
//        while(num <= maxNumber)
//        {
//            System.out.print(num + " ");
//            num++;
//        }
//
//        System.out.println("\n");
//    }
//
//    private void guessMyNumber()
//    {
//        Scanner userInput = new Scanner(System.in);
//
//        int number; //Loop control variable
//
//// do while loops are used when you want to execute the code in the braces at least once
//
//        do
//        {
//            System.out.print("Guess my number up to 100: ");
//            number = userInput.nextInt();
//        }while(number != 50); //while it's not 50 the loop will continue to iterate
//
//        System.out.println("Yes, the number was 50!\n");
//    }
//
//    public void stringStuff()
//    {
//        String phrase = "Star Warz";
////index 012345678
//
////length()
//        int len = phrase.length();
//        System.out.println("\nThe length of the phrase is " + len + " characters");
//
////charAt()
//        System.out.println("The first letter as a char for " + phrase + " is " +  phrase.charAt(0) + " its ASCII value is " + (int)phrase.charAt(0));
//
////substring()
//        System.out.println("The first letter as a String is: " + phrase.substring(0, 1));
//        System.out.println("The second word of the phrase is: " + phrase.substring(5,9));
//        System.out.println("The second word of the phrase is: " + phrase.substring(5));
//    }
//
//    public static void main(String[] args)
//    {
//        LoopsNStrings luke = new LoopsNStrings();
//
//        luke.countToTwenty(3);
//        luke.printNumbers(15);
//        luke.guessMyNumber();
//        luke.stringStuff();
//    }
//}
