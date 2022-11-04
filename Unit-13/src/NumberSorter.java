//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		
		int count = 0;
		int stuff = number;
		while (stuff> 0)
		{
			stuff = stuff/10;
			
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		
		int[] sorted = new int[getNumDigits(number)];
		int bruh = getNumDigits(number);
		for (int i = 0; i < bruh; i++) 
		{
			
			int remainder = 0;
			remainder = number%10;
			sorted[i] = remainder;
			number = number/10;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}