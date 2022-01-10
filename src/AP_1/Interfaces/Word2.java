package AP_1.Interfaces;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
//index     0123456789
		int vowelCount=0;

		for (int i = 0; i < word.length(); i++)
		{
			if (word.substring(i, i+1).equals(vowels.substring(0,1)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(1,2)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(2,3)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(3,4)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(4,5)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(5,6)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(6,7)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(7,8)))
			{
				vowelCount++;
			}
			else if(word.substring(i, i+1).equals(vowels.substring(8,9)))
			{
				vowelCount++;
			}

			else if(word.substring(i, i+1).equals(vowels.substring(9,10)))
			{
				vowelCount++;
			}
		}

		return vowelCount;
	}

	public String getWord()
	{
		return word;
	}

	public String toString()
	{
		return word;
	}

	@Override

	public int compareTo( Word2 arg0 )
	{
		if(numVowels() == arg0.numVowels())
		{
			return word.compareTo(arg0.toString());
		}
		else
			return numVowels()-arg0.numVowels();


	}
}
