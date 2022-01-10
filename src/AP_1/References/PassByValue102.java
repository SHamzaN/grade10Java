package AP_1.References;


public class PassByValue102
{
    public static void main(String[] args, Student102 changeName)
    {
        Student102 student101 =  new Student102("Harry");
        System.out.println("Student before: ");
        System.out.println(student101);

        changeName = (student101);
        System.out.println();
        System.out.println("");
    }

    public static void changeName(Student102 student)
    {
        student.setName("Tom");

        System.out.println("\nStudent During: ");
        System.out.println(student);

        ;
    }
}

