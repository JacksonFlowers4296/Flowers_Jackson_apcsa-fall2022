//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter bruh = new NumberShifter();
		//add test cases
		int size = 0;
		int[] array = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(array));
		System.out.println(bruh.shiftEm(array));
		
	}

	

	
}




