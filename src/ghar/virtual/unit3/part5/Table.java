package ghar.javawork.virtual.unit3.part5;
import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter table length: ");
        int userInput = s.nextInt();
        System.out.println("N\t10*N\t100*N\t1000*N");
        System.out.println("-------------------------------");

        int count = 1;
        do {
            System.out.println( count + "\t" +  count * 10 + "\t\t" + count * 100 + "\t\t" + count * 1000);
            count++;
        } while(count <= userInput && count < 10);

    }
}