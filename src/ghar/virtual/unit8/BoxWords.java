package ghar.javawork.virtual.unit8;
import java.util.Scanner;
public class BoxWords
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scan.next();
        System.out.print(str);
            String words =  "\n";

//        for (int i = 1; i < str.length();i++) {
//        char width = str.charAt(i);
//            System.out.println(width);
//            str = str.substring(0,str.length()-1);
//        }
//        str1.append(str);
//        str1.reverse();
//        System.out.println(str1);
        StringBuilder input1 = new StringBuilder();

        for (int i = 1; i < str.length() - 1; i++) {
            words += str.charAt(i);

            for (int j = 0; j < str.length() - 2; j++)
                words += " ";
            words += str.charAt(str.length() - (i + 1)) + "\n";
        }
        System.out.print(words);
        input1.append(str);
        input1.reverse();


        System.out.print(input1);


        }
    }
