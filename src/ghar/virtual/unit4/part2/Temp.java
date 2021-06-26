package ghar.javawork.virtual.unit4.part2;

public class Temp
{
    public void tempV(double num){
        double output = num - 32;
        double output1 = (output * 5 / 9);
        System.out.println("The temp in Celsius is " + output1);
    }
    public double tempR(double num){
        double output = num - 32;
        double output1 = (output * 5 / 9);
        return output1;
    }

}
