package ghar.javawork.virtual.unit7.notes;

public class Boolean106
{
    public static void main(String[] args)
    {
        int age1 = 15;
        int age2 = 16;
        boolean awesome = true;

        System.out.println("If you or your friend are 15, and your both AWESOME, you can come to my party!");
        System.out.println("Age: " + age1);
        System.out.println("Age: " + age2);

        if((age1 == 15 || age2 == 5) && awesome)
        System.out.println("\nYou can come to my party! ");
            else
        System.out.println("\nYou cannot come to my party! ");
    }
}
