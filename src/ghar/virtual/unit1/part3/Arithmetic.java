package ghar.javawork.virtual.unit1.part3;

public class Arithmetic {
    public static void main(String[] args){
        int num1 = 77;
        int num2 = 32;
        int sum = 0;
        int difference = 0;
        int product = 0;
        int quotient = 0;
        int remainder = 0;

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("        Arithmetic");
        System.out.println("============================");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

    }
}

