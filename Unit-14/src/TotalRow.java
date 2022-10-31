//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int[][] one = {{1,2,3},{5,5,5,5}};
    	int[][] two = {{1,2,3},{5},{1},{2,2}};
    	int[][] three = {{1,2,},{5,5},{5,5},{4,5,6,7},{123124,12312}};
    	
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
				m = one;
			if (i == 1)
				m = two;
			if (i == 2)
				m = three;
		for(int j = 0; j < m.length; i++)	
		{
			for(int v = 0; j < m[j].length; i++)
			{
				TotalRow.getRowTotals(m).add( m[j][v]);
			}
		}
		return TotalRow.getRowTotals(m);
		}
    	
    	return null;
    }
}
