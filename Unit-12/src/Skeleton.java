//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String namey1;
	private int sizey1;
	private String namey2;
	private int sizey2;
	public Skeleton()
	{
		isSmaller(0, "");
		isBigger(0, "");
	}
	public Skeleton(String name1, int size1, String name2, int size2) 
	{
		
	}
	public int getHowBig(int size1, int size2)
	{
		sizey1 = size1;
		sizey2 = size2;
		return 0;
	}
	public String getName(String name1, String name2)
	{
		namey1 = name1;
		namey2 = name2;
		return "";
	}
	public boolean isBigger(int other, String thing)
	{
		sizey2 = other;
		if ((sizey2 - other)>= 1)
		{
			return true;
			
	    }
		if ((sizey2 - other)>= 1)
		{
			thing = "Monster one is bigger than Monster two.";	
	    }

		
		return false;
	}
	public boolean isSmaller(int other, String thing)
	{
		
		sizey2 = other;
		if ((sizey2 - other) <= 1)
		{
			return true;
	    }
		if ((sizey2 - other)<= 1)
		{
			thing = "Monster one is smaller than Monster two.";	
	    }
		return false;
	}
	public boolean namesTheSame(String other)
	{
		int thingy = namey1.length();
		int know = 0;
		String thingyy = "";
		for (int i = 0; i < thingy; i++)
		{
			if(namey1.charAt(i) - namey2.charAt(i) != 0)
				know++;
		}
	  if (know != 0)
	  {  return false; }
	  if (know != 0)
	  {  thingyy = "Moneter one has a different name than Monster two"; }
	  if (know == 0)
	  {  return true; }
	  if (know == 0)
	  {  thingyy = "Moneter one has the same name as Monster two"; }
	return true;
	}
	public String toString(int other, String thing, String thingyy)
	{
		return "" + thing + "\n" + thingyy; 
		
	}
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	
}