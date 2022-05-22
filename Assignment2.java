/*
 * FibRecursive is a method that take the place of a term in the Fibonacci sequence and returns the term.
 * 
 * @author Arion Adiram
 * 
 * @param n the place of the term
 * 
 * @return	the term of at the place
 */

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter place to find number: ");
		int place = obj.nextInt();
		int num;
		
		num = FibRecursive(place);
		
		if(place == 1) {
			System.out.println("The 1st term of the Fibonacci sequence is " + num + ".");
		}
		else if(place == 2) {
			System.out.println("The 2nd term of the Fibonacci sequence is " + num + ".");
		}
		else if(place == 3) {
			System.out.println("The 3rd term of the Fibonacci sequence is " + num + ".");
		}
		else {
			System.out.println("The " + place + "th term of the Fibonacci sequence is " + num + ".");
		}

	}
	
	public static int FibRecursive(int n) {
		if(n == 0 || n == 1){
			return n;
		}
		return FibRecursive(n - 1) + FibRecursive(n - 2);
	}

}
