package week1.day1.classroom;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)use of for loop
	 * 2)declaring variables 
	 * 3)finding the factorial and printing the value
	 * 
	 */	
	
	public static void main(String[] args) {

		// Declare your input as 5
		int num=5;
		
		// Declare an integer variable fact as 1
		int fact=1;
		
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <=num; i++) {
			
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			// fact=fact*i;
			   fact*=i;
		
	    //End of loop
		}
		
		// Print factorial (fact)
		System.out.println("Factorial of "+num+" = "+fact);	
	}
}
