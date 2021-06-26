package ghar.javawork.virtual.unit9.notes;
public class Arrays102{
    public static void main(String[] args){
        String[] bigbang = {"BTS", "K/DA", "Blackpink"};
        System.out.println(bigbang[0] + "," + bigbang[1] + "," + bigbang[2]);

        bigbang[0] = "red velvet";

        System.out.println(bigbang[0] + "," + bigbang[1] + "," + bigbang[2]);

        int len = bigbang.length;

        System.out.println("The length of the array is: " + len);
        System.out.println("The last element of the array is: " + bigbang[len-1]);
    }
}