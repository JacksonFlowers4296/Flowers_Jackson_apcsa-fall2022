import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What First Value do you want to detect?:: ");
		int one = keyboard.nextInt();
		
		System.out.print("What Second Value do you want to detect?:: ");
		int two = keyboard.nextInt();
		
		System.out.print("What Third Value do you want to detect?:: ");
		int three = keyboard.nextInt();
		
		System.out.print("What Fourth Value do you want to detect?:: ");
		int four = keyboard.nextInt();
		int val = 0;
		int valy = 0;
		int last = 0;
		int stuff = 0;
		MatrixCount1 bruh = new MatrixCount1();
		for (int i = 0; i < 4; i++)
		{
			val++;
			if (i == 0)
				stuff = one;
			if (i == 1)
				stuff = two;
			if (i == 2)
				stuff = three;
			if (i == 3)
				stuff = four;
		System.out.println("The "+ stuff + " count is " + bruh.count(last,valy,i,val,one,two,three,four));
		}
	}
}



