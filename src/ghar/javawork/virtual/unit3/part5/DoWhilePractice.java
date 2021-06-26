package ghar.javawork.virtual.unit3.part5;

public class DoWhilePractice
{
    public static void main(String[] args)
    {
        int num = 0;

        do
        {
            System.out.print(num + " ");
            num++;
        }while(num <= 20);

        System.out.print("\n");
        //System.out.println("\n");

        int num1 = 1;
        do{
            System.out.print(num1 + " ");
            num1+=2;

        }while(num1 <= 49);
        System.out.print("\n");
        //	System.out.println("\n");

        int num2 = 0;

        do{
            System.out.print(num2 + " ");
            num2+=10;

        }while(num2 <= 200);
        //	System.out.print("\n");
        System.out.print("\n");
        int i = 97;
        do {
            System.out.print((char)(i) + " ");
            i++;
        }while (i <= 122);

    }

}