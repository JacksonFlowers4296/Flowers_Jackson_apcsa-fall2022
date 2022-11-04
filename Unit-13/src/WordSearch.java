//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private String tester;
    
    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int stuff = 0;
    	for (int i = 0; i < m.length; i++)
    		{for (int j = 0; j < m[i].length; j++)
    		{
    			m[i][j] = str.substring(stuff, stuff + 1);
    			stuff++;
    		}
    		
    		}
    }

    public boolean isFound(String word)
    {
    	for (int i = 0; i < m.length; i++)
		{for (int j = 0; j < m[i].length; j++)
		{
			checkRight(word, i, j);
			checkLeft(word, i, j);
			checkUp(word, i, j);
			checkDown(word, i, j);
			checkDiagUpRight(word, i, j);
			checkDiagUpLeft(word, i, j);
			checkDiagDownLeft(word, i, j);
			checkDiagDownRight(word, i, j);
			if (checkRight(word, i, j))
			{
				return true;
			}
		}
		  
		}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		
		
		
		
		   
		tester = "APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS";
			
			
			if ((tester.contains(w)))
            {
			return true;
}

			
			
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		tester = "SIHTLXKLISMHGIHTBSTBGDQUPUUHATNYMNGOGDPFGCXXLLGGEDEEKJHLXPYXELPPA";
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		tester = "IBPMGEXALTUYFGHPKHQNPGHPXIDTDLJLLGGAGLKETHBHOXEXHMTUGXEYISSUNCDP";
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		tester = "PDCNUSSIYEXGUTMHXEXOHBHTEKLGAGGLLJLDTDIXPHGPNQHKPHGFYUTLAXEGMPBI";
		if ((tester.contains(w)))
        {
		return true;
}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		tester = "PDYCEXENXEEUGCKLSOULGPSTHGLHPIMBADGLAHHGTPGXTGDNFELIQYGXHUMKTPLBI";
		          
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		tester = "IHSTMSLHTUXGBUNKIGHGCLHDAOXDITQTGXEPBUNDLEYPYPLKXMFGJEGGHLELPXPA";
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		tester = "APXPLELHGGEJGFMXKLPYPYELDNUBPEXGTQTIDXOADHLCGHGIKNUBGXUTHLSMTSHI";
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		tester = "IBLPTKMUHXGYQILEFNDGTXGPTGHHALGDABMIPHLGHTSPGLUOSLKCGUEEXNEXECYDP";
		if ((tester.contains(w)))
        {
		return true;
}
		return false;
	}

    public String toString()
    {
 		String ok = "";
 		for (int i = 0; i < m.length; i++)
		{for (int j = 0; j < m[i].length; j++)
		{
			ok += m[i][j];
			ok += " ";
		}
		    ok += "\n";
		}
 		return ok;
    }
}

