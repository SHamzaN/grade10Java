package ghar.javawork.virtual.unit6.part1;
public class Mammal extends Animal{
    protected String furcolor;

    public  Mammal(int a ,String fc){
        super(a);
        furcolor = fc;
    }
    @Override
    public String toString(){
        return super.toString() + "\nFur color: " + furcolor;
    }
}