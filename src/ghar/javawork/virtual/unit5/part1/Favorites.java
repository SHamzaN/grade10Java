package ghar.javawork.virtual.unit5.part1;

public class Favorites
{
    //instance variables
    private String name;
    private String food;
    private String color;
    private String music;
    private String automobile;
    private String sport;
    //constructor
    public Favorites(String names, String foods, String colors, String musics,String automobiles, String sports){
        name = names;
        food = foods;
        color = colors;
        music = musics;
        automobile = automobiles;
        sport = sports;

    }
    //toString( )
    public String toString(){
        return "Name: " + name +
                "\n" + "Food: " + food +
                "\n" + "Color: " + color +
                "\n" + "Music: " + music +
                "\n" + "Automobile: " + automobile +
                "\n" + "Sport: " + sport;
    }


}
