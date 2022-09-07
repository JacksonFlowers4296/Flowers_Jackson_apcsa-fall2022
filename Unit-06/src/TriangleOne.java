//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
	}

	public void setWord(String s)
	{
	}

	public void print( )
	{
	}
	public static String go(String s) 
	{
	out.println(s);
    for(int i = 0; i < s.length(); i++)
    {
    
    out.println( s = s.substring(0, s.length() - 1));
    
    }
    out.println(s.charAt(1));
    return "";
	}
}