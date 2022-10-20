//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\flowersj3032\\Desktop\\apcsa code\\Flowers_Jackson_apcsa-fall2022\\Unit-12\\src\\words.dat"));
        
		
		int size = file.nextInt();
		
		for( int i = 0; i < size - 1; i++)
		{
			
			String s = file.nextLine();
			Word thing = null;
			Word words = new Word(s);
			Word second = new Word(s+1);
		for( int j = i; j < size - 1; i++)	
		{
			if( words.compareTo(second) == -1)
			{
				thing = words;
			}
		}
		System.out.println("sus");
		}

		








	}
}
