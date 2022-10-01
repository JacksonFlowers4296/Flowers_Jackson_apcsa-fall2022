import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int count = 0;
		for(int i = 0; i < ray.size(); i++)
			if(ray.get(i) > first)
				count = count + ray.get(i);
		
		if (count > 0)
			return count;
		
		if (count == 0)
			count = -1;
		return count;
			
	}
}
