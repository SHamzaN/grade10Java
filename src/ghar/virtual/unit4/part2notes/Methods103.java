package ghar.javawork.virtual.unit4.part2notes;

public class Methods103
{
    public double averageThree(int n1, int n2, int n3)// This method depends on its helpers
    {
        //	int sum = sumThree(n1,n2,n3);
        //	return divideThree(sum); // Can have a method call in a return statement

        return divideThree(sumThree(n1,n2,n3)); //Can have a method call as the parameter of another method call.
    }


    // Helper methods should have restricted acces this can be achieved with "private"

    private int sumThree(int num1,int num2,int num3) // Helper method
    {
        int sum = num1 + num2 + num3;
        return sum;

        //return num1 + num2 + num3; //Can perform an operation in a return statement
    }
    private double divideThree(int num4){

        return (double)num4/3;
    }


}