package ghar.javawork.virtual.unit6.majorlab;
public class Car{
    String type;
    Wheel carWheel;
    Engine carEngine;
    Paint carPaint;

    public Car(String t, int wc, int hp, String pc){
        System.out.println("Car Constructor Called ");
        type = t;
        carWheel = new Wheel(wc);
        carEngine = new Engine(hp);
        carPaint = new Paint(pc);

    }
    @Override
    public String toString(){
        return "Car type: " + type +
                "\nWheel Count: " + carWheel.getWheelCount () +
                "\nHorse Power: " + carEngine.getHorsePower() +
                "\nPaint Color: " + carPaint.getPaintColor();

    }
}
