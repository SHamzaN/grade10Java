package AP_1.Recursion;


public class Recursion106
{
    public static void main(String[] args)
    {
        int list[] = new int[100];
        assign(list);
        display(list);

        System.out.println("\n\nCalling iterative linear search");
        System.out.println("Number 425 is located at index " + linear1(list,425));
        System.out.println("Number 311 is located at index " + linear1(list,311));

        System.out.println("\n\nCalling iterative linear search");
        System.out.println("Number 425 is located at index " + linear2(list,425,0));
        System.out.println("Number 311 is located at index " + linear2(list,311,0));
    }

    public static void assign(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = 100 + i * 5;
        }
    }

    public static void display(int[] list)
    {
        for(int num : list)
            System.out.print(num + " ");
    }

    //Iterative Linear Search
    public static int linear1(int list[], int key)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == key)
                return i;
        }

        return -1;
    }

    //Recursive Linear Search
    public static int linear2(int[] list, int key, int index)
    {

        if(index == list.length)
            return -1;
        if(list[index] == key)
            return index;
        else
            return linear2(list,key, index + 1);
    }
}

