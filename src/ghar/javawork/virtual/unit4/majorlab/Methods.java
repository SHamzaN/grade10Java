package ghar.javawork.virtual.unit4.majorlab;

public class Methods
{

    public int square(int num){
        return num * num;
    }
    /**
     * @return the square of num
     *  @param //int the number to be squared
     */
    //  square Method


    public int sumThree(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
    /** @return the sum of num1, num2, and num3
     *  @param //int first number in the sum
     *  @param //int second number in the sum
     *  @param //int third number in the sum
     */
    //  sumThree Method


    public double average(int num1,int num2){
        //  double average1 = num1 + num1 / 2;
        // double average2 = num2 + num2;
        return (num1 + num2) / 2 ;

    }
    /** @return the average of num1 and num2
     *  @param //double  first number in average
     *  @param //double  second number in average
     */
    //  average Method


    public int smaller(int num1,int num2){

       if (num1 < num2){
           num2 = num1;
       }
       return num2;
//        return Math.min(num1,num2);

    }
    /** @return the smaller value between num1 and num2
     * @param //int first number in minimum comparison
     * @param //int second number in minimum comparison
     */
    //  smaller Method


           public int randomInt(int num1){


               return (int) (Math.random() * num1);
           }
    /** @return an integer random number in the range of [1..range] inclusive
     *  @param //int range the upper bounds of generated random number
     */
    //  randomInt Method


     public String evenOdd(int num1) {

         if (num1 % 2 == 0) {
           return "even";
         }
         return "odd";

     }
    /** Determines if num is odd or even. If num is even returns the string "even";
     *  otherwise it returns the string "odd"
     *  @return the string "even" or the string "odd"
     *  @param // int number used in comparison
     */
    //  evenOdd Method


         public String getLetterGrade(int num){
             if(num >= 90){
                 return "A";
             }
             if(num >= 80){

                 return "B";
             }
             if(num >= 75){

                 return "C";
             }
             if(num >= 70){

                 return "D";
             }
             return "F";
         }
    /** Determines the letter grade for grade
     *  @return a string value of "A", "B", "C", or "F"
     * @param //int the grade that needs to be converted into a letter grade
     */
    //  getLetterGrade Method


      public void greeting(String name){
        if (name.equals("John")){
            System.out.println(name + " have a nice day!");
        } else if (name.equals("Sarah")){
            System.out.println(name + " have a nice day!");
        }

      }
    /** Prints the parameter name followed by the phrase
     *  " have a nice day!"
     *  @param //name the name to be displayed
     *  @ return N/A
     */
    //  greeting Method


      public String firstLetter(String str){
          return str.substring(0,1);
      }
    /** @return the first letter from parameter str
     *  @param //str string used to extract first letter from
     *
    firstLetter Method */


        public String lastLetter(String str){
            return str.substring(str.length()-1);
        }
    /** @return the last letter from parameter str
     *  @param str string used to extract last letter from
     */
    //  lastLetter Method

         public String removeFirst(String str){
             return str.substring(1);
         }

    /** @return a substring of str that has first letter removed
     *  @param str string used to extract first letter from
     */
    //  removeFirst Method


    public String removeLast(String str){
        return str.substring(0,str.length()-1);
    }
    /** @return a substring of str that has last letter removed
     *  @param //str string used to extract last letter from
     */
    //  removeLast Method


     public String merge(String str1,String str2, String str3){
         return str1 + " " + str2 +  " " + str3;
     }
    /** @return a string with str1, str2, and str3 merged together
     *  @param// str1 first string to be merged
     *  @param //str2 second string to be merged
     *  @param //str3 third string to be merged
     */
    //  merge Method


        public String repeatFirst(String str){
           return str.substring(0,1) + str.substring(0,1) + str.substring(0,1);
        }
    /** @return a string that is the first letter of parameter
     *   str repeated three times.
     *  @param str string used to extract first letter from
     */
    //  repeatFirst Method


        public String repeatLast(String str){
            return str.substring(str.length()-1) + str.substring(str.length()-1) + str.substring(str.length()-1);
        }

    /** @return a string that is the last letter of parameter
     *   str repeated three times.
     *  @param str string used to extract last letter from
     */
    //  repeatLast Method





}