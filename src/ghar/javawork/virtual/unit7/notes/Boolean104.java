package ghar.javawork.virtual.unit7.notes;

public class Boolean104
{
    public static void main(String[] args)
    {
        int age1 = 15;
        int age2 = 16;

        System.out.println("If your age is under 11 or greater than 14, you can come to my party!");
        System.out.println("Age: " + age1 + "\nAge: " + age2);

        if(age1 < 11 || age2 > 14)
            System.out.println("\nYou can come to my party!");
        else
            System.out.println("\nYou cannot come to my party!");
    }
}
