
import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{			
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		ListSumFirst run1 = new ListSumFirst();
		ray.add(-99);
		ray.add(1);
		ray.add(2);
		ray.add(3);
		ray.add(4);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(5);
		System.out.println(run1.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run2 = new ListSumFirst();
		ray.add(10);
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
		System.out.println(run2.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run3 = new ListSumFirst();
		ray.add(10);
		ray.add(20);
		ray.add(30);
		ray.add(40);
		ray.add(50);
		ray.add(-11818);
	    ray.add(40);
		ray.add(30);
		ray.add(20);
		ray.add(10);
		System.out.println(run3.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run4 = new ListSumFirst();
		ray.add(32767);
		System.out.println(run4.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run5 = new ListSumFirst();
		ray.add(255);
		ray.add(255);
		System.out.println(run5.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run6 = new ListSumFirst();
		ray.add(9);
		ray.add(10);
		ray.add(-88);
		ray.add(100);
		ray.add(-555);
		ray.add(2);
		System.out.println(run6.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run7 = new ListSumFirst();
		ray.add(10);
		ray.add(10);
		ray.add(10);
		ray.add(11);
		ray.add(456);
		System.out.println(run7.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run8 = new ListSumFirst();
		ray.add(-111);
		ray.add(1);
		ray.add(2);
		ray.add(3);
		ray.add(9);
		ray.add(11);
		ray.add(20);
		ray.add(1);
		System.out.println(run8.go(ray));
		
		ray = new ArrayList<Integer>();
		ListSumFirst run9 = new ListSumFirst();
		ray.add(9);
		ray.add(8);
		ray.add(7);
		ray.add(6);
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(0);
		ray.add(-2);
		ray.add(6);
		
		System.out.println(run9.go(ray));
	}
}
