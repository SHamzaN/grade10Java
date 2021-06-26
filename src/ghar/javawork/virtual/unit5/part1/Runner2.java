package ghar.javawork.virtual.unit5.part1;
import java.util.Scanner;

public class Runner2 {
    public static void main(String args[]) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter X1: ");
        double x1 = key.nextDouble();

        System.out.print("Enter Y1: ");
        double y1 = key.nextDouble();

        System.out.print("Enter X2: ");
        double x2 = key.nextDouble();

        System.out.print("Enter Y2: ");
        double y2 = key.nextDouble();


        Distance dist = new Distance( x1, y1, x2, y2);


        dist.calcDistance();
        dist.print();

    }
}
