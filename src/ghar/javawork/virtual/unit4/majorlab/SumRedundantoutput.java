package ghar.javawork.virtual.unit4.majorlab;

import java.util.Scanner;

public class SumRedundantoutput {
    /**
     * functional - interface
     * Or
     * lambda expression sample
     */
    public static void main(String[] args) {
  //      int a = 2, b = 3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        SumRedundant sumRedundantAdd = (int one, int two) -> one + two;
        SumRedundant sumRedundantMul = (int one, int two) -> one * two;
        SumRedundant sumRedundantDiv = (int one, int two) -> one / two;

        System.out.println("add use case: " + sumRedundantAdd.calculate(a, b));
        System.out.println("mul use case: " + sumRedundantMul.calculate(a, b));
        System.out.println("div use case: " + sumRedundantDiv.calculate(a, b));
    }
}
