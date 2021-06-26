package ghar.javawork.virtual.unit4.part1;

public class SurfaceArea {

    public void surfaceAreaV(int num){
        double surfacearea = Math.pow(num, 2);
        double surfacearea1 = surfacearea * 6;
        System.out.println("The surface area is: " + surfacearea1);

    }
    public double surfaceAreaR(int num){
        double surfacearea = Math.pow(num,2);
        double surfacearea1 =  surfacearea * 6;
       return surfacearea1;

    }
}
