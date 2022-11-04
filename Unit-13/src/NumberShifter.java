//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[20];
		size = array.length;
		for (int v = 0; v<size-1; v++)
		{
			array[v] = (int) (Math.random()*10) + 1;
			
			
		}
		return array;
	}
	public static String shiftEm(int[] array)
	{
		for(int i=0; i< array.length-1; i++){
		      int min = i;
		      for(int j = i+1; j<  array.length; j++)
		      {
		         if( array[j] == 7)
		            min = j;    		
		      }
		      if(min != i) {
		         int temp = array[min];
		         array[min] = array[i];
		         array[i] = temp;   	
		      }
		   }
		return Arrays.toString(array);
	}
}

