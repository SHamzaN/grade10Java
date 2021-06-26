package ghar.javawork.virtual.unit4.part2;

public class LineSlope
{
    public void slopeV(int x1,int y1, int x2, int y2){
        double slope =(double) (y2-y1) / (x2 - x1);

        System.out.println("The slope is " + slope);
    }
    public double slopeR(int x1, int y1, int x2, int y2){

        return (double) (y2-y1) / (x2 - x1);
    }
}