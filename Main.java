package javaProjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 6;
		int y = 3;
		
		//System.out.println(x + y);
		//System.out.println(x - y);
		//System.out.println(x * y);
		//System.out.println(x / y);
		//System.out.println(x % y);
		//System.out.println(x);
		//System.out.println(y);
		
		//System.out.println(x == y);
		//System.out.println(x != y);
		//System.out.println(x > y);
		//System.out.println(x < y);
		//System.out.println(x >= y);
		System.out.println(y > x);
		
		System.out.println(x <= y);
		// returns true because 6 is greater
		//than  3 and less than 10
		System.out.println(x > 3 && x < 10);
		// returns true because 6 is greater 
		//than  3 and less than 8.
		System.out.println(x < 3 || x < 8);
		
		// returns false because ! (not) is use to reverse
		//the result 
		System.out.println(!(x > 3 && x < 7));

	}
	

}
