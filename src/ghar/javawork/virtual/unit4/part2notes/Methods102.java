package ghar.javawork.virtual.unit4.part2notes;
public class Methods102
{
    public void methodOne()
    {
        System.out.println("Juan");
        // Does not need an identifier because it is being called by a method in the same class.
        // Methods that are called by other methods are helper methods
        // Call MethodTwo here
        methodTwo();
    }

    // Helper method, helper methods should only be accessed by methods in their own class, make them private
    private void methodTwo()
    {
        System.out.println("too");
    }


}
