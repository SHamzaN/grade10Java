package ghar.javawork.virtual.unit7.notes;

public class Boolean103
{
    public static void main(String[] args)
    {
        // &&
        int age = 14;

        System.out.println("If your age is between 10 and 15, you can come to my party!");
        System.out.println("Age: " + age);

        if(age >= 10 && age <= 15)
            System.out.println("\nYou can come to my party!");
        else
            System.out.println("\nYou cannot come to my party!");

    }
}