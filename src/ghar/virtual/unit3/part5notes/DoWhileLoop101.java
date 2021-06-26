package ghar.javawork.virtual.unit3.part5notes;

public class DoWhileLoop101 {
    public static void main(String[] args)
    {
        int lcv = 1;

        do
        {
            System.out.print(lcv + " ");
            lcv++;
        }while(lcv <= 10); // Put a semicolon here

        System.out.println("\n" + lcv);
        System.out.println("\n");

        lcv = 10;

        do
        {
            System.out.print(lcv + " ");
            lcv--;
        }while(lcv > 0);

        System.out.println("\n");

        lcv = 10;

        do
        {
            System.out.print(lcv + " ");
            lcv += 10;
        }while(lcv <= 100);

        System.out.println("\n");

        lcv = 1;
        do
        {
            System.out.println(lcv + ". Happy Friday!");
            lcv++;
        }while(lcv <= 10);
        System.out.println("\n");
    }
}