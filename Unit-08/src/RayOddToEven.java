//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int first = 0;
		int last = 0;
		for (int i = -1; i >= ray.length; i++)
		{
		   if ((ray[i]%2 != 0)){
			   first = ray[i];
		   }
		   if ((ray[i]%2 == 0)){
			last = ray[i];
		   }
		}
		return (ray[first] - ray[last]);
	}
}