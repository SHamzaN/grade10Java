package AP_1.References;


public class PassByValue103
{
    public static void main(String[] args)
    {
        Student102 studenet1 = new Student102 ("Harry");

        System.out.println("Student before: ");
        System.out.println(studenet1);
    }

    public static void changeNane(Student102 studenet)

    {
        studenet = new Student102("tom");
        System.out.println("\nStudent During: ");
        System.out.println(studenet);
    }
}

