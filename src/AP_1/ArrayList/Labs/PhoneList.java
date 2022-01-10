package AP.ArrayList.Labs;

import java.util.*;

public class PhoneList
{
    private ArrayList<Contact> phoneList = new ArrayList<Contact>();

    public void getContactInfo()
    {
        String ans = "";
        Scanner scan = new Scanner(System.in);

        while (!ans.equalsIgnoreCase("n"))
        {
            System.out.print("Enter name -->");
            String word = scan.nextLine();
            System.out.print("Enter phone number -->");
            String number = scan.nextLine();


            phoneList.add(new Contact(word,number));
            System.out.println();
            System.out.print("Continue [Y or N}? ");
            ans = scan.nextLine();
            System.out.println();

        }
    }

    public void printContactInfo()
    {
        System.out.println("      Contact List");
        System.out.println("-----------------------------");


    }
    public String toString()
    {
        String output = "";
        for(int i = 0; i < phoneList.size(); i++)
        {
            output += phoneList.get(i).getName() + "      " +  phoneList.get(i).getPhone();
        }


        return output;
    }


    public static void main(String[] args)
    {
        PhoneList app = new PhoneList();
        app.getContactInfo();
        app.printContactInfo();
        System.out.println(app);
    }
}
