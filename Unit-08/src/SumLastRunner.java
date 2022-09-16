//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{	
		RaySumLast run = new RaySumLast();
		System.out.println(run.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,5}));
		RaySumLast run1 = new RaySumLast();
		System.out.println(run1.go( new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
		RaySumLast run2 = new RaySumLast();
		System.out.println(run2.go( new int[]{10,20,30,40,50,-11818,40,30,20,10}));
		RaySumLast run3 = new RaySumLast();
		System.out.println(run3.go( new int[]{32767}));
		RaySumLast run4 = new RaySumLast();
		System.out.println(run4.go( new int[]{255,255}));
		RaySumLast run5 = new RaySumLast();
		System.out.println(run5.go( new int[]{9,10,-88,100,-555,1000}));
		RaySumLast run6 = new RaySumLast();
		System.out.println(run6.go( new int[]{10,10,10,11,456}));
		RaySumLast run7 = new RaySumLast();
		System.out.println(run7.go( new int[]{-111,1,2,3,9,11,20,30}));
		RaySumLast run8 = new RaySumLast();
		System.out.println(run8.go( new int[]{9,8,7,6,5,4,3,2,0,-2,-989}));
		RaySumLast run9 = new RaySumLast();
		System.out.println(run9.go( new int[]{12,15,18,21,23,1000}));
		RaySumLast run10 = new RaySumLast();
		System.out.println(run10.go( new int[]{250,19,17,15,13,11,10,9,6,3,2,1,-455}));
		RaySumLast run11 = new RaySumLast();
		System.out.println(run11.go( new int[] {9,10,-8,10000,-5000,1000}));
		
	}
}