//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees(int number )
	{

int thing = 0;
int check = 0;
int sub = 0;
int place = 0;
String stuff = String.valueOf(number);
String bruh = "qwr";
check = number%10;

if (check-3 == 0 && place != 0)
{
	thing++;
	}
place++;

bruh = (stuff.substring(1,(stuff.length())));
sub = Integer.parseInt(bruh);
if (bruh != "")
{
   luckyThrees(sub);
}
		return thing;

	}
}