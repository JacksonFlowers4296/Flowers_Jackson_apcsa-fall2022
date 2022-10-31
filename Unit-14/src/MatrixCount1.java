//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count(int last, int valy, int i,int val, int one, int two, int three, int four  )
    {
    	last = 0;
		if (val == 1)
			valy = one;
		if (val == 2)
			valy = two;
		if (val == 3)
			valy = three;
		if (val == 4)
			valy = four;
		
		for (int v = 0; v < 5; v++)
		{
		for(int p = 0; p < 5; p++)
		{
			if (m[v][p] == valy)
				last++;
		}
		}
		return last;
    }
}
