//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		//Added a scanner so people can input the toy and the number
		Scanner keyboard = new Scanner(System.in);
		String choices="";
		do {
		
		out.print("Enter a toy ::");
		String nm = keyboard.next();
		
		out.print("Enter the amount of said toy::");
		int cnt = keyboard.nextInt();
		
		Toy toys = new Toy(nm, cnt);
		System.out.println(toys);
		out.print("Want to go again? :: ");
		choices = keyboard.next();
		}while(choices.equals("Y")||choices.equals("y"));
	}
}
