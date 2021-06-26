package ghar.javawork.virtual.unit5.part1;
public class State
{


    private String name;
    private String bird;
    private String flowers;
    private String song;
    private String motto;
    private String tree;
    //instance variables

    //constructors
    public State(){
        name = "null";
        bird = "null";
        flowers = "null";
        song = "null";
        motto = "null";
        tree = "null";

    }
    public State(String stateName, String birds, String flower, String songs, String mottos, String trees){
        name = stateName;
        bird = birds;
        flowers = flower;
        song = songs;
        motto = mottos;
        tree = trees;
    }

    //toString()
    public String toString(){
        return "State Name   : " + name +
                "\n" + "State Bird  : " + bird +
                "\n" + "State Flower: " + flowers +
                "\n" + "State Song  : " + song +
                "\n" + "State Motto : " + motto +
                "\n" + "State Tree  : " + tree;
    }
}
