package AP_1.SearchandSort.Labs;

import java.util.Arrays;
import static java.lang.System.*;
public class WordSortRunner
{
    public static void main(String args[])
    {
//add test cases
            WordSort first = new WordSort("abc ABC 12321 fred alexander ");
            first.sort();
        out.println(first);

        WordSort second = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR ");
        second.sort();
        out.println(second);

        WordSort third = new WordSort("b x 4 r s y $ ");
        third.sort();
        out.println(third);

        WordSort fourth = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2 ");
        fourth.sort();
        out.println(fourth);
    }
}
