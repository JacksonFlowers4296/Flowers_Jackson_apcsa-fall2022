//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		setName("amog");
		setCount(0);
	}

	public Toy( String nm, int cnt )
	{
		setName(nm);
		setCount(cnt);
	}
	
	public int getCount()
	{
		count = 3456;
		return 0;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		name = "amog";
		return null;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}
