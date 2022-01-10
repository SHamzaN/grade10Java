package AP_1.SearchandSort.Labs;//package AP_1.SearchandSort.Labs;

import java.util.*;
import java.io.*;

public class SpellCheck
{
        // constant
        public static final int LIST_SIZE = 150000;
        
	// instance variable
	private String[] wordList;   // list of words
        private int numWords = 0;   // logical size of wordList
	
	// constructor
	public SpellCheck()
	{
	   wordList  = new String[LIST_SIZE];
	   readFile();
	   searchWords();	
	}
	
	// Performs a binary search on the wordlist looking for key.
	// If key is found, it returns true;  
	// otherwise it returns false
	public boolean binarySearch(String key)
	{
		int low = 0;
		        int high = LIST_SIZE - 1;

		         while(high >= low) {
		             int middle = (low + high) / 2;
		            if(wordList[middle].equals(key))
		            {
			                return true;
			             }
		             if(wordList[middle].compareTo(key) < 0)
		             {
			                 low = middle + 1;
			            }
		             else if(wordList[middle].compareTo(key) > 0)
		             {
			                 high = middle - 1;
		             }
		        }
		        return false;

	}
	
	// Interface used to check spelling of words
	public void searchWords()
	{
		Scanner keyboard = new Scanner(System.in);
		String ans="Y";
		while(ans.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter word -->");
			String word = keyboard.nextLine();
			System.out.println();
			
			if(binarySearch(word) == true)
			   System.out.println(word + " is spelled correctly.");
			else
			{
			   System.out.println(word + " is spelled incorrectly!");
			}
			
			System.out.println();
			System.out.print("Enter another word[Y/N]? ");
			ans = keyboard.nextLine();
			System.out.println();
		}
	}
	
	// Populates wordlist from a text file of words
        // Updates logical size of wordList
	public void readFile()
	{
		System.out.println("Reading wordlist ...");
		System.out.println();
		Scanner scan=null;
		try
		{
			scan = new Scanner(new File("spellcheck.txt"));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found.");
		}
		
		while(scan.hasNextLine())
		{
			String str = scan.nextLine();
			wordList[numWords] = str;
                        numWords++;
		}			
	}
	
	public static void main(String[] args)
	{
		SpellCheck spellCheck = new SpellCheck();
	}
}