package ghar.javawork.virtual.unit4.part2;
public class StarsAndStripes
{
    private void printTwentyStars(){

        System.out.println("********************");
    }

    private void printTwentyDashes(){
        System.out.println("--------------------");
//        int i;
//        for (i = 0; i <= 10; i++){
//            System.out.print("-");
//        }


    }

    public void printTwoBlankLines(){
        System.out.println();
        System.out.println();
    }

    public void printASmallBox(){
        //Call printTwentyStars() & printTwentyDashes() in this method
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }

    public void printABigBox(){
        //Make methods calls to printASmallBox() in this method
        printASmallBox();
        printASmallBox();
    }
}