//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer 3 ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer 5 ");
		intTwo = keyboard.nextInt();
        
		System.out.print("Enter a decimal 3.0");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a decimal 7.0");
        doubleTwo = keyboard.nextDouble();
        System.out.print("Enter a float 8.0");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter a float 9.0");
        floatTwo = keyboard.nextFloat();
        System.out.print("Enter a short 1");
        shortOne = keyboard.nextShort();
        System.out.print("Enter a short 2");
        shortTwo = keyboard.nextShort();
		//add in input for all variables



		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("double one = " + doubleOne );
		System.out.print("double two = " + doubleTwo);
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		//add in output for all variables


	}
}