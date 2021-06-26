package ghar.javawork.virtual.unit9.notes;

public class Arrays104
{
    public static void main(String[] args)
    {
        String[] names = new String[5];

        names[0] = "Asher";
        names[1] = "Alice";
        names[2] = "Ryan";
        names[3] = "Janice";
        names[4] = "Nandika";

        System.out.println(names[0] + ", ");
        System.out.println(names[1] + ", ");
        System.out.println(names[2] + ", ");
        System.out.println(names[3] + ", ");
        System.out.println(names[4]);

        //A better way

        for(int i = 0; i < names.length; i++)
            System.out.println(names[i] + " ");

    }
}