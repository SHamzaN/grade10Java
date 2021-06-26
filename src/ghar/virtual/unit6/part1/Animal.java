package ghar.javawork.virtual.unit6.part1;

public class Animal{

    protected int age;
    public Animal(int a){
        age = a;
    }
    @Override
    public String toString(){
        return "\nAge: " + age;
    }
}
