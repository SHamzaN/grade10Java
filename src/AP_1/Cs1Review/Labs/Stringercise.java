package AP_1.Cs1Review.Labs;

public class Stringercise {

    String name = "Sayyid";
    public Stringercise()
    {
        System.out.println("1. " + name);
        name += " Hamza";
        System.out.println("2. " + name);
        name = name.concat(" Naqvi");
        System.out.println("3. " + name);
        name = name.toLowerCase();
        System.out.println("4. " + name);
        name = name.toUpperCase();
        System.out.println("5. " + name);
        System.out.println("6. " + name.length());
        System.out.println("7. " + name.substring(0,6));
        System.out.println("   " + name.substring(7,12));
        System.out.println("   " + name.substring(13,18));
        System.out.println("8. " + name.charAt(0) + name.charAt(7) + name.charAt(13));
        System.out.println("9. " + name.indexOf("H"));
        name = name.replace('S','X');
        System.out.println("10. " + name);

        int num = 5;
        int num1 = 15;
        int num2 = 21;

        int age = 15;


        String compare = null;
        String str = compare.valueOf(num);
        System.out.print("11. " + str);
        String str1 = compare.valueOf(num1);
        System.out.print("," + str1);
        String str2 = compare.valueOf(num2);
        System.out.print("," + str2);
        String str3 =  compare.valueOf(age);

       int n = str.compareTo(str3);
        System.out.print("\n" + "12. " + n);
       int n1 = str1.compareTo(str3);
        System.out.print("," + n1);
       int n2 = str2.compareTo(str3);
        System.out.print("," + n2);
        int backtoInt = Integer.parseInt(str);
        int backtoInt1 = Integer.parseInt(str1);
        int backtoInt2 = Integer.parseInt(str2);
        int total = backtoInt + backtoInt1 + backtoInt2;
        System.out.println("\n13. " + total);








    }
    public static void main(String[] args)
    {
        Stringercise stringercise = new Stringercise();

    }
}
