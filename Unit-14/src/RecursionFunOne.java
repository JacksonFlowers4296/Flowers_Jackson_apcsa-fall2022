//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{

int thing = 0;
int check = 0;
int sub = 0;
int place = 0;
String stuff = String.valueOf(num);
String bruh = "qwr";
check = num%10;

if (check%2 == 0)
{
	thing++;
	}
place++;

bruh = (stuff.substring(1,(stuff.length())));
sub = Integer.parseInt(bruh);
if (bruh != "")
{
   countOddDigits(sub);
}
		return thing;

	}
}