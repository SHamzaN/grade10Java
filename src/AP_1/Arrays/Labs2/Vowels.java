package AP_1.Arrays.Labs2;
import java.util.Scanner;

public class Vowels
{
    private String[] strings = new String[10];
    private int count;

    public String[] scan() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 10 words ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Word " + (i + 1) + "-->");
            strings[i] = keyboard.nextLine();
        }
        return strings;
    }

    public int count(String string)
    {
        count = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o' || string.charAt(j) == 'u') {
                count++;
            }
        }
        return count;
    }

    public String print()
    {
        StringBuilder output = new StringBuilder();
        for (String string : strings) {
            output.append("\n").append(string).append(" - ").append(count(string));
        }
        return output.toString();
    }

    public String toString()
    {
        return "" + print();
    }

    public static void main(String[] args)
    {
        Vowels vowels = new Vowels();
        vowels.scan();
        System.out.println(vowels);
    }
}
