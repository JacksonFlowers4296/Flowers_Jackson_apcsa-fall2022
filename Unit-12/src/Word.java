//(c) A+ Computer Science
//www.apluscompsci.com

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
		
	}
	
	
	public int compareTo(Word rhs )
	{	
		Word other = rhs;
		String amog = "";
		if (word.length() > rhs.word.length())
		{
			return 1;
			
		}
		
		if (word.length() < rhs.word.length())
		{
			return -1;
			
		}
		if (word.length() < rhs.word.length())
		{
			
			amog = word;
		}
	return 0;
	}

	public String toString(String amog)
	{
			
		return "" +  amog;
	}
	

	
}
