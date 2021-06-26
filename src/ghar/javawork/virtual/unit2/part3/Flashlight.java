package ghar.javawork.virtual.unit2.part3;
public class Flashlight
{
    public static void main(String[] args)
    {
        // Start here!

        String str = "flashlight";
        System.out.println("Part 1\n=================");

        System.out.println(str.substring(0, 5) + str.substring(10));
        System.out.println(str.substring(5, 10) + str.substring(10));
        System.out.println(str.substring(2, 5) + str.substring(10));
        System.out.println(str.substring(0, 1) + str.substring(5,10));
        System.out.println(str.substring(0, 3) + str.substring(7,8));
        System.out.println(str.substring(0,1) + str.substring(6,7) + str.substring(9,10) );
        System.out.println(str.substring(4,5) + str.substring(6,7) + str.substring(7,9));
        System.out.println(str.substring(7,8) + str.substring(2,4) );
        System.out.println(str.substring(0,1) + str.substring(2,4) + str.substring(9,10)  );
        System.out.println(str.substring(3,5) + str.substring(2,3) + str.substring(0,1) + str.substring(9,10) +"\n" );
        //  System.out.println("\n");
        System.out.println("Part 2\n=================");

        System.out.println(str.substring(5, 10) + 's');
        System.out.println(str.substring(5, 10) + "er");
        System.out.println(str.substring(5, 10) + "ning");
        System.out.println( "en" + str.substring(5, 10) + "ened");



    }
}