package ghar.javawork.virtual.unit9.notes;
public class Arrays106{
    public static void main(String[] args){
        String[] names = new String[5];

        names[0] = "David";
        names[1] = "Irene";
        names[2] = "Madeline";
        names[3] =  "Andrew";
        names[4] =  "Dan-ahh";

        System.out.println("Enhanced for loop before");
        for(String name : names)
            System.out.print(name + " ");

        System.out.println();

        for(String x : names)
            x = "Smelly";
        System.out.println("\nEnhanced for loop after");
        for(String name : names)
            System.out.print(name + " ");

        for(int i = 0; i < names.length; i++)
            names[i] = "Lit";
        System.out.println("\nEnhanced for loop before");
        for(String name : names)
            System.out.print(name + " ");
    }
}