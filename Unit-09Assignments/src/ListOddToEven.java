//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		
		int odd = 0;
		int even = 0;
		int oddy = 0;
		int eveny = 0;
		int num = -1;
		int result = -1;
		for(int i = 0; i < ray.size(); i++)
		{
			oddy++;
		    eveny++;
		    num++;
		   
			if (ray.get(num)%2 != 0 && odd == 0)
			{
				odd = oddy;
			    
			}    
			if (ray.get(num)%2 == 0)
			{
				even = eveny;
			}
		}
		if ((odd > 0) || (even > 0))
		{
			result = even - odd;
		}
		if ((odd == 0) || (even == 0))
		{
			result = -1;
		}
		
	return result;
	  
		
				
	}
}
