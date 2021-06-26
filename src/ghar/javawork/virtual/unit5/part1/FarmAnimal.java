package ghar.javawork.virtual.unit5.part1;

public class FarmAnimal
{
    private int cows;
    private int horses;
    private int pigs;
    private int chickens;
    private String name;

    public FarmAnimal(){
        cows = 0;
        horses = 0;
        pigs = 0;
        chickens = 0;
        name = "";
    }
//    public FarmAnimal(int cs, int h, int p, int ch, String n){
    public FarmAnimal(String n, int cs, int h, int p, int ch){
        cows = cs;
        horses = h;
        pigs = p;
        chickens = ch;
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getCows(){
        return cows;
    }
    public int getHorses(){
        return horses;
    }
    public int getPigs(){
        return pigs;
    }
    public int getChickens(){
        return chickens;
    }


}
