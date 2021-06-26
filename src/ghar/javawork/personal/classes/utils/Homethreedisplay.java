package ghar.javawork.personal.classes.utils;

public class Homethreedisplay extends Hometwo{
    @Override
    public void kitchen() {
        System.out.println("Kitchen has stuff");

    }
    public static void main(String[] args){
           Hometwo item1 = new Hometwo();
           item1.kitchen();
        System.out.println(item1);

    }
}
