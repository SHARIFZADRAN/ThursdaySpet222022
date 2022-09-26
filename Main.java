 package javaProjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 6;
		int y = 3;
		int z = 6;
		
			//The Console view displays the output of the utilities invoked when 
		//       building a project or the programs output when running/debugging. 
		//print or println method is responsible for printing the argument 
		//       and printing a new line to console
		// user input is consist of elements such input and output streams
		//       that we give to to our program
		
		System.out.println("The sum is " + (x + y));
		System.out.println("The Result of Subtraction is " + (x - y));
		System.out.println("The Result of Addition is " + (x * y));
		
		System.out.println("The Result of Division is " + ( x / y));
		
		System.out.println("If (x) % (z) = x Than (z) = " + z);
		
		System.out.println("The value of x Integer "  + (x));
		System.out.println("The value of y Integer " + (y));
		
		System.out.println("The String Result of (x = 6) less (y = 4) is = " + (x == y));
		System.out.println("The value of Integer x = " + (x != y));
		System.out.println("The value of Integer y = " + (x > y));
		System.out.println("The String Result of (x = 6) < (y = 4) is = " + (x < y));
		System.out.println("The String Result (x = 6) - (z = 6) is = " + (x >= z));
		System.out.println("The String Result of Y greater than X = " + (y > x));
		
		System.out.println("The String Result of (x = 6) less than or equal (y = 4) is = " + (x <= y));
		
		//returns true because 6 is greater
		//than  3 and less than 10
		System.out.println("The String Result of (x = Greater 3) (x = less than 10) is = " + (x > 3 && x < 10));
		// returns true because 6 is greater 
		//than  3 and less than 8.
		System.out.println("x = Greater 3 x = less than 8 = " + (x < 3 || x < 8));
		
		// returns false because ! (not) is use to reverse
		//the result 
		//System.out.println(!(x > 3 && x < 7));

	}
	

}
