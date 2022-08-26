//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		double bill;
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		bill = keyboard.nextDouble();
		// i changed the variable "amt" to the variable "bill" 
		//so that i could get transfer the amount from the
		//main code to the runner.
		System.out.print("Your new bill amount :: " + Discount.getDiscountedBill(bill));

	}

	
}