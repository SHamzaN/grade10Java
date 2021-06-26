package ghar.javawork.virtual.unit9;
import java.util.*;

public class ArrayPractice
{
    public void method1()
    {
        int[] array1 = new int[5];
        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 6;
        array1[3] = 8;
        array1[4] = 10;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println();
        for(int i = 0; i < 5; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println();
    }

    public void method2()
    {
        int[] array2= new int[6];
        array2[0] = 1;
        array2[1] = 3;
        array2[2] = 5;
        array2[3] = 7;
        array2[4] = 9;
        array2[5] = 11;


    }

    public void method3()
    {

    }

    public void method4()
    {

    }

    public void method5()
    {

    }

    public void method6()
    {

    }

    public static void main(String[] args)
    {
        ArrayPractice app = new ArrayPractice();

        app.method1();
        app.method2();
        app.method3();
        app.method4();
        app.method5();
        app.method6();
    }
}