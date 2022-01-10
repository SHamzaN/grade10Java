package AP_1.Arrays.Labs2;

import java.util.*;

public class Inventory
{
    // instance variables
    private Book[] books;     // declare array variable
    private int numBooks;     // logical size of array

    // constructor
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }

    /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks()
    {
        System.out.println("************************\r\n" +
                "*       addBooks       *\r\n" +
                "************************");
        String ans = "";
        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.print("Student Name -->");
            String name = keyboard.nextLine();

            System.out.print("Book Number -->");
            String number = keyboard.nextLine();


            books[numBooks] = new Book(name,number);
            numBooks = numBooks+1;
            System.out.println();
            System.out.print("Enter another book[y/n]: ");
            ans = keyboard.nextLine();
            System.out.println();


        }
        while(ans.equalsIgnoreCase("y")) ;


    }

    /* This method displays the student name and book number for each
     * Book in the array.
     */
    public void printBooks()
    {
        System.out.println("\r\n" +
                "************************\r\n" +
                "*      printBooks      *\r\n" +
                "************************");
        for(int i = 0; i < numBooks; i++)
        {
            System.out.println(books[i]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
}
