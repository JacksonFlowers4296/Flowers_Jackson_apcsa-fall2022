//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jackson flowers
//Date - 8/26/2022
//Class - APCSA
//Lab  - Unit-04

import static java.lang.System.*;

import java.util.Scanner;

public class NumberVerifyRunner
{
	
	public static void main ( String[] args )
	{
		int num;
		
		//add in input
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
	}
}