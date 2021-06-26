package ghar.javawork.virtual.unit7.notes;

public class Boolean105
{
    public static void main(String[] args)
    {
        int age1 = 15;
        int age2 = 16;
        System.out.println("If you or your friend are 15, but not both of you, you can come to my party!");
        System.out.println("Age: " + age1);
        System.out.println("Age: " + age2);

        if(age1 == 15 ^ age2 == 16)
            System.out.println("\nYou can come to my party!");
        else
            System.out.println("\nYou cannot come to my party!");
    }
}