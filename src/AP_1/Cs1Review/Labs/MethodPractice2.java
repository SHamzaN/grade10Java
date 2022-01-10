package AP.Cs1Review.Labs;

import java.util.*;

public class MethodPractice2
{

    private Scanner keyboard = new Scanner(System.in);

    // Implement methods below this line
    public void greeting(String firstName, int num){
        for (int i = 0; i < num; i++){
            System.out.println(firstName + ", have a nice day.");
        }
    }

    public void range(int begin, int end){
        if(begin < end){
          for (int i = begin; i <= end; i ++){
              System.out.println(i);
          }
        }
    }
    public boolean compare(String str){


        return (str.charAt(0) == str.charAt(str.length()-1));
    }

    public String reverse(String str){
        String reverse = "";
      for (int i = str.length(); i > 0;i--){
         reverse = reverse + str.charAt(i-1);
      }
      return reverse;
    }
    public int numOccurrences(String word, String letter) {

        int count = 0;
        char ch = letter.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }

        }
        return count;
    }


        public static void main (String[]args)
        {
            MethodPractice2 app = new MethodPractice2();

            System.out.println("******************");
            System.out.println("   Test greeting");
            System.out.println("******************");
            app.greeting("Kendall", 6);

            System.out.println("\n\n******************");
            System.out.println("   Test range");
            System.out.println("******************");
            app.range(10, 15);

            System.out.println("\n\n******************");
            System.out.println("   Test compare");
            System.out.println("******************");
            System.out.println(app.compare("demand"));
            System.out.println(app.compare("football"));
            System.out.println(app.compare("bulb"));

            System.out.println("\n\n******************");
            System.out.println("   Test reverse");
            System.out.println("******************");
            System.out.println(app.reverse("ball"));
            System.out.println(app.reverse("courage"));
            System.out.println(app.reverse("hamburger"));

            System.out.println("\n\n******************");
            System.out.println("   Test numOccurrences");
            System.out.println("******************");
            System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
            System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
            System.out.println(app.numOccurrences("TEXAS", "R"));
            System.out.println();
        }
    }

