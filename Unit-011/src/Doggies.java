//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int set;
	private String Name;
	private int sety;
	private String Namey;

	public Doggies(int size)
	{
		pups = new Dog[size];
	    Name = "sus";
		set = 0;
		Namey = "amog";
		sety = 10000000;
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
		if (age > set)
		{
			Name = name;
			set = age;
		}
		if (age < sety) 
		{
			Namey = name;
			sety = age;
		}
	}

	public String getNameOfOldest()
	{
		
		
		
		return Name;
		
	}

	public String getNameOfYoungest()
	{
		return Namey;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
