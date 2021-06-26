package ghar.javawork.virtual.unit1.part2notes;

public class DataTypes101
{
    public static void main(String[] args)
    {
        //	int intNum = 1000; // int is too small of a datatype for the last operation which leads to "Memory Overflow"
        long intNum = 1000L; // long would be large enough to hold all the values.
        System.out.println("intNum: " + intNum);

        //intNum = 1000 * 1000
        intNum = intNum * 1000;
        System.out.println("intNum: " + intNum);

        intNum = intNum * 1000;
        System.out.println("intNum: " + intNum);

        intNum = intNum * 1000;
        System.out.println("intNum: " + intNum);

    }
}