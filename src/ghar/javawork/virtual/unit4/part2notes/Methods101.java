package ghar.javawork.virtual.unit4.part2notes;

public class Methods101
{
    public String weekdayName(int day)// All the formal parameters put together is called the method signature
    {
        /* Java requires a catch-all return statement in return methods
         * otherwise it generates a compile error. */

        if(day == 0)
            return "Sunday";
        else if(day == 1)
            return "Monday";
        else if(day == 2)
            return "Tuesday";
        else if(day == 3)
            return "Wednesday";
        else if(day == 4)
            return "Pre-Friday";
        else if(day == 5)
            return "Friday";
        else if(day == 6)
            return "Caturday";
        //	else
        return "Illegal Weekday Number";

        // to fix this either use an else or a return at the end of the method.


    }
}