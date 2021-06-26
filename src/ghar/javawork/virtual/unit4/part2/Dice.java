package ghar.javawork.virtual.unit4.part2;
public class Dice
{
    public void printRolls(){ // use the method rollDie 3 times in your implementation

        for (int i = 0; i < 6; i++) {
            System.out.println(rollDie());
        }

    }

            private int rollDie( ){ // private helper method
               double  number =   Math.random() * 5 + 2 ;
                return (int) number;
            }

 /* * @Param - N/A
  @Return - random number [1-6]
 */

}
