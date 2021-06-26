package ghar.javawork.virtual.unit5.part1;

public class Distance {
    private int xOne, yOne, xTwo, yTwo;
    private double distance;

    public Distance() {
        setCoordinates(0, 0, 0, 0);
        distance = 0;
    }

    public Distance(double x1, double y1, double x2, double y2) {

        xOne = (int) x1;
        yOne = (int) y1;
        xTwo = (int) x2;
        yTwo = (int) y2;

    }

    public void setCoordinates(double x1, double y1, double x2, double y2) {

//        public void setCoordinates(int x1, int y1, int x2, int y2)
//        {
        xOne = (int) x1;
        yOne = (int) y1;
        xTwo = (int) x2;
        yTwo = (int) y2;


    }

    public void calcDistance() {

       double powerTwo = 2.00;

       double xNet = (double)xTwo - (double) xOne;
       double yNet = (double)yTwo - (double) yOne;

       double xSquare = Math.pow(xNet, powerTwo);
       double ySquare = Math.pow(yNet, powerTwo);

     //distance = Math.sqrt((xTwo - xOne)^2.00 + (yTwo - yOne) ^ 2);// not able to take double as input , Error: Operator '^' cannot be applied to 'int', 'double'
        distance = Math.sqrt(xSquare + ySquare );
    }

    public void print() {
        System.out.println("distance == " + distance);


    }
}