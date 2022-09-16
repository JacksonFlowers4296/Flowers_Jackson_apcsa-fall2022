//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{

	
	public static int go(int[] ray)
	{
		
		int last = ray[ray.length-1];
		
	    for (int i = -1; i >= ray.length; i++)
		{
			int sum = 0;
			if (ray[i] > last) 
				 sum = (sum + ray[i]);
			if (i == ray.length) 
				return sum;
			}
	  
	return (-1);
	  
	}
}