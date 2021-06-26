package ghar.javawork.virtual.unit6.part2;
public class ChampionPacket extends AllStarPacket{
    private int photo5x7;

    public ChampionPacket(){
        photo5x7 = 2;
    }
    @Override
    public String getPacketName(){
        return "ChampionPlan";
    }
    @Override
    public String toString(){
        return super.toString()  + "\n" +
                "5 x 7 = " + photo5x7;
    }
}
