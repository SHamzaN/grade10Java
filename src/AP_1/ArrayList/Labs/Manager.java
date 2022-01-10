package AP.ArrayList.Labs;


import java.util.Scanner;

public class Manager
{
    private Diet diet;
    private Scanner scan;
    private Entry entry;

    public Manager()
    {
        diet = new Diet();
        entry = new Entry();
        scan = new Scanner(System.in);
        mainMenu();
    }

    public void mainMenu()
    {
        int ans = 0;
        do {
            System.out.println("======================");
            System.out.println("        Main Menu");
            System.out.println("======================");
            System.out.println("1. Add Record");
            System.out.println("2. View Record");
            System.out.println("3. View All Records");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Selection: ");
            ans = scan.nextInt();
            System.out.println();

            if (ans == 1)
            {
                addRecord();
            }
            else if (ans == 2)
            {
                viewRecord();
            }
            else if (ans == 3)
            {
                viewAllRecords();
            }

        }while (ans !=4);

    }

    public void addRecord()
    {
        String ans = "";
        int weight;
        System.out.println("========================");
        System.out.println("       Add Record");
        System.out.println("========================");
        System.out.println();
        System.out.print("Enter date -->");
        ans = scan.nextLine();
        ans = scan.nextLine();
        System.out.print("Enter weight -->");
        weight = scan.nextInt();
        diet.addEntry(ans, weight);

    }

    public void viewRecord()
    {
        String userProvidedData = "";
        System.out.println("========================");
        System.out.println("       View Record");
        System.out.println("========================");
        System.out.println();
        System.out.print("Enter date -->");
        userProvidedData = scan.nextLine();
        userProvidedData = scan.nextLine();

        if(diet.getEntry(userProvidedData) != null)
        {
            System.out.println("Date   =" + diet.getEntry(userProvidedData).getEntryDate() );
            System.out.println("Weight =" + diet.getEntry(userProvidedData).getWeight());
        }
        else
            System.out.println("Entry does not exist");

    }

    public void viewAllRecords()
    {
        System.out.println("============================");
        System.out.println("       View All Records");
        System.out.println("============================");
        System.out.println();
        diet.viewList();

    }

    public static void main(String[] args)
    {
        Manager app = new Manager();

    }
}
