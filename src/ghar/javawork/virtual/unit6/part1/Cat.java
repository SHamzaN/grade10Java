package ghar.javawork.virtual.unit6.part1;

public class Cat extends Mammal{
    protected String type;
    public Cat(int a, String fc, String t){
        super(a,fc);
        type = t;
    }
    @Override
    public String toString(){
        return super.toString() + "\nType: " + type;
    }
}
