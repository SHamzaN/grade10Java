package AP_1.References;


public class StaticVariables101
{

    public static void main(String[] args)
    {
        Student103 stu1 = new Student103("Luke");
        Student103 stu2 = new Student103("Leia");

        stu1.collectMoney(100.50);
        System.out.println(stu1 + "\n");

        stu2.collectMoney(200.25);
        System.out.println(stu2 + "\n");

        Student103 stu3 = new Student103("Vader");
        System.out.println(stu1 + "\n");
        System.out.println(stu2 + "\n");
    }
}

