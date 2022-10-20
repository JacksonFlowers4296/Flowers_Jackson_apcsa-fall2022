//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		String choices="";
		do {
		
		out.print("Enter 1st monster's name :");
		String name1 = keyboard.next();
		
		out.print("Enter 1st monster's size:");
		int size1 = keyboard.nextInt();
		
		out.print("Enter 2nd monster's name :");
		String name2 = keyboard.next();
		
		out.print("Enter 2nd monster's size:");
		int size2 = keyboard.nextInt();
		
		
		Skeleton skele = new Skeleton(name1, size1, name2, size2);
		System.out.println(skele);
		out.print("Want to create more monsters? :: ");
		choices = keyboard.next();
		}while(choices.equals("Y")||choices.equals("y"));
	}
}
