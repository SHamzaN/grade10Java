package ghar.javawork.virtual.unit7.notes;

public class Boolean107
{
    public static void main(String[] args)
    {
        int total = 2;
        boolean flag = true;
        if(flag || total == 6/0)
        //if(total == 6/0 || flag)
        //  if(flag | total == 6/0)
        {
            System.out.println("true");
        }
        System.out.println("circuit");
    }
}
