package ghar.javawork.virtual.unit6.part2;

public class AllStarPacket extends StarterPacket{

    private int photoMagazineCover;
    private int photoTradingCards;

    public AllStarPacket(){
        photoMagazineCover = 1;
        photoTradingCards = 16;
    }
    @Override
    public String getPacketName(){
        return  "AllStarPlan";
    }
    @Override
    public String toString(){
        return super.toString()  + "\n" +
                "Magazine Cover = " + photoMagazineCover + "\n" +
                "Trading Cards  = " + photoTradingCards;
    }
}
