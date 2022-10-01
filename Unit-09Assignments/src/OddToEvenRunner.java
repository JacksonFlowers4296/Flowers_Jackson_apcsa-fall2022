import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		ListOddToEven run1 = new ListOddToEven();
		ray.add(7);
		ray.add(1);
		ray.add(5);
		ray.add(3);
		ray.add(11);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(12345);
		ray.add(11);
		System.out.println(run1.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run2 = new ListOddToEven();
		ray.add(11);
		ray.add(9);
		ray.add(8);
		ray.add(7);
		ray.add(6);
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(1);
		ray.add(-99);
		ray.add(7);
		System.out.println(run2.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run3 = new ListOddToEven();
		ray.add(10);
		ray.add(20);
		ray.add(30);
		ray.add(40);
		ray.add(5);
		ray.add(41);
		ray.add(31);
		ray.add(20);
		ray.add(11);
		ray.add(7);
		System.out.println(run3.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run4 = new ListOddToEven();
		ray.add(32767);
		ray.add(70);
		ray.add(4);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		System.out.println(run4.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run5 = new ListOddToEven();
		ray.add(2);
		ray.add(7);
		ray.add(11);
		ray.add(21);
		ray.add(5);
		ray.add(7);
		System.out.println(run5.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run6 = new ListOddToEven();
		ray.add(7);
		ray.add(255);
		ray.add(11);
		ray.add(255);
		ray.add(100);
		ray.add(3);
		ray.add(2);
		System.out.println(run6.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run7 = new ListOddToEven();
		ray.add(9);
		ray.add(11);
		ray.add(11);
		ray.add(11);
		ray.add(7);
		ray.add(1000);
		ray.add(3);
		System.out.println(run7.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run8 = new ListOddToEven();
		ray.add(7);
		ray.add(7);
		ray.add(7);
		ray.add(11);
		ray.add(2);
		ray.add(7);
		ray.add(7);
		ray.add(11);
		ray.add(11);
		ray.add(2);
		System.out.println(run8.go(ray));
		
		ray = new ArrayList<Integer>();
		ListOddToEven run9 = new ListOddToEven();
		ray.add(2);
		ray.add(4);
		ray.add(6);
		ray.add(8);
		ray.add(8);
		System.out.println(run9.go(ray));
		
	}
}
