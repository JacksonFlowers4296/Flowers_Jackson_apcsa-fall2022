import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		ArrayList<Integer> numArray;
		numArray = new ArrayList<Integer>();
		ListDown run1 = new ListDown();
		numArray.add(-99);
		numArray.add(1);
		numArray.add(2);
		numArray.add(3);
		numArray.add(4);
		numArray.add(5);
		numArray.add(6);
		numArray.add(7);
		numArray.add(8);
		numArray.add(9);
		numArray.add(10);
		numArray.add(12345);
		System.out.println(run1.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run2 = new ListDown();
		numArray.add(10);
		numArray.add(9);
		numArray.add(8);
		numArray.add(7);
		numArray.add(6);
		numArray.add(5);
		numArray.add(4);
		numArray.add(3);
		numArray.add(2);
		numArray.add(1);
		numArray.add(-99);
		System.out.println(run2.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run3 = new ListDown();
		numArray.add(10);
		numArray.add(20);
		numArray.add(30);
		numArray.add(40);
		numArray.add(50);
		numArray.add(-11818);
		numArray.add(40);
		numArray.add(30);
		numArray.add(20);
		numArray.add(10);
		System.out.println(run3.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run4 = new ListDown();
		numArray.add(32767);
		System.out.println(run4.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run5 = new ListDown();
		numArray.add(255);
		numArray.add(255);
		System.out.println(run5.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run6 = new ListDown();
		numArray.add(9);
		numArray.add(10);
		numArray.add(-88);
		numArray.add(100);
		numArray.add(-555);
		numArray.add(1000);
		System.out.println(run6.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run7 = new ListDown();
		numArray.add(10);
		numArray.add(10);
		numArray.add(10);
		numArray.add(11);
		numArray.add(456);
		System.out.println(run7.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run8 = new ListDown();
		numArray.add(-111);
		numArray.add(1);
		numArray.add(2);
		numArray.add(3);
		numArray.add(9);
		numArray.add(11);
		numArray.add(20);
		numArray.add(30);
		System.out.println(run8.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run9 = new ListDown();
		numArray.add(9);
		numArray.add(8);
		numArray.add(7);
		numArray.add(6);
		numArray.add(5);
		numArray.add(4);
		numArray.add(3);
		numArray.add(2);
		numArray.add(0);
		numArray.add(-2);
		numArray.add(-989);
		System.out.println(run9.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run10 = new ListDown();
		numArray.add(-99);
		numArray.add(12);
		numArray.add(15);
		numArray.add(18);
		numArray.add(21);
		numArray.add(23);
		numArray.add(1000);
		System.out.println(run10.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run11 = new ListDown();
		numArray.add(250);
		numArray.add(19);
		numArray.add(17);
		numArray.add(15);
		numArray.add(13);
		numArray.add(11);
		numArray.add(10);
		numArray.add(9);
		numArray.add(6);
		numArray.add(3);
		numArray.add(2);
		numArray.add(1);
		numArray.add(-455);
		System.out.println(run11.go(numArray));
		
		numArray = new ArrayList<Integer>();
		ListDown run12 = new ListDown();
		numArray.add(9);
		numArray.add(10);
		numArray.add(-8);
		numArray.add(10000);
		numArray.add(-5000);
		numArray.add(1000);
		System.out.println(run12.go(numArray));
	}
}
