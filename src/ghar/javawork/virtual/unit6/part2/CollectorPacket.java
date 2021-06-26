package ghar.javawork.virtual.unit6.part2;

public class CollectorPacket extends ChampionPacket{
    private int photoWallets;

    public CollectorPacket(){
        photoWallets = 8;
    }
    @Override
    public String getPacketName(){
        return "CollectorPlan";
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Wallets = " + photoWallets;
    }

}