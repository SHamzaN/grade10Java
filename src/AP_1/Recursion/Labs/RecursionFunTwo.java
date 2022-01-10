package AP_1.Recursion.Labs;

import static java.lang.System.*;
public class RecursionFunTwo
{
    public static int countChickens(String word)
    {
            int index = word.indexOf("chicken");
            if (word.contains("chicken"))
            {
                return 1 + countChickens(word.substring(0, index) + word.substring(index + 7));
            }

       return 0;

    }
}
