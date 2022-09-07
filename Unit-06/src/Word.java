//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
	}

	public void setString(String s)
	{
	}

	public char getFirstChar()
	{
		return 0;
	}

	public char getLastChar()
	{
		return 0;
	}

	public String getBackWards()
	{
		String back="";
		return back;
	}

 	public static String go(String s) {
 		StringBuilder rev = new StringBuilder(s);
 		rev.reverse();
 		//reverses it
 		 for(int i = 0; i < 1; i++)
 	    {
 			 out.println(s.charAt(0) );
 			out.println(s.substring(s.length() - 1) );
 			out.println(rev.toString());
 			out.println(s);
 	    }
 		return "";
 	}
}