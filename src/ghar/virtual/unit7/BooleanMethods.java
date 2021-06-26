package ghar.javawork.virtual.unit7;

public class BooleanMethods
{



    /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     * @param str1 first string to determine length of
     */


   public boolean firstLast(String str1){
       if (str1.substring(0,1).equals(str1.substring(str1.length() -1))){
           return true;
       }
       else return false;
   }


    // firstLast Method



    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  MUST CONTAIN AN IF ELSE STATEMENT
     */
    public boolean sameLength(String str1, String str2) {
        if (str1.length() == str2.length()){
            return true;
        }
        else return  false;
    }

    // sameLength Method



    /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     *  @param str1 first string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */

    public boolean firstLast2(String str1) {
        if (str1.substring(0,1).equals(str1.substring(str1.length() -1))){
            return true;
        }
        return false;
    }



    // firstLast2 Method



    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */

    public boolean sameLength2(String str1, String str2) {
        if (str1.length() == str2.length()){
            return true;
        }
        return false;
    }
    // sameLength2 Method



}