package ghar.javawork.virtual.unit5.part1;
public class Runner3
{

    public static void main(String[] args)
    {
        // Start here!
        State blankState = new State();


        // State tx = new State("Texas" + "mockingbird" + "bluebonnet" + "Texas, Our Texas" + "friendship" + "pecan");
        State Texas = new State( "Texas" ,"mockingbird" , "bluebonnet" , "Texas, Our Texas" , "friendship" , "pecan");

        State Oklahoma = new State("Oklahoma" , "scissor-tailed flycatcher" , "Oklahoma Rose" , "Oklahoma" , "labor omnia vincit (labor conquers all things)" , "redbud");
        //Texas.State = "Texas" + "mockingbird" + "bluebonnet" + "bluebonnet" + "Texas, Our Texas" + "friendship" + "pecan";
        // State ok = new State("Oklahoma" + "scissor-tailed flycatcher" + "Oklahoma Rose" + "Oklahoma" + "labor omnia vincit (labor conquers all things)" + "redbud" );

        System.out.println("****************************");
        System.out.println("  Test Default Constructor");
        System.out.println("****************************");
        System.out.println(blankState);  // call toString method
        System.out.println();
        System.out.println("****************************");
        System.out.println("    Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(Texas);       // call toString method
//        System.out.println(Texas.t);
        System.out.println();
        System.out.println("****************************");
        System.out.println("    Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(Oklahoma);    // call toString method
        System.out.println();
    }
}
