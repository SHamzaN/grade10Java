package AP.Arrays;
public class Arrays102
{
    public static void main(String[] args)
    {
        String[] teenTitans = {"Cyborg", "Robin", "Raven", "Starfire"};
        System.out.println(teenTitans[0] + " " + teenTitans[1] + " " + teenTitans[2] + " " + teenTitans[3]);

        teenTitans[1] = "BeastBoy";
        System.out.println(teenTitans[0] + " " + teenTitans[1] + " " + teenTitans[2] + " " + teenTitans[3]);

        int len = teenTitans.length;

        System.out.println("The length of the array is: " + len);

        System.out.println("The last element(memeber) of Teen Titans is: " + teenTitans[len-1]);

//System.out.println(teenTitans[len]); index out of bounds
    }

}
