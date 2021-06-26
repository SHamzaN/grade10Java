package ghar.javawork.virtual.unit3.part3;

import java.util.Scanner;
public class LoopStats
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = s.nextInt();
        System.out.println("Enter stop: ");
        int stop = s.nextInt();

        int sum = 0;
        int eventCount = 0;
        int oddCount = 0;

        for(int i = start; i <= stop; i++) {
            sum = sum + i;
            System.out.print(i + " ");
            if (i % 2 == 0) {
                eventCount++;
            } else
            oddCount++;
        }
        System.out.println("\ntotal: " + sum);
        System.out.println("even count: " + eventCount);
        System.out.println("odd count " + oddCount);

    }
}