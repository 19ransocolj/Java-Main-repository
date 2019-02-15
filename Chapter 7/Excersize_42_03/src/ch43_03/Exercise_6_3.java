/*
Colby Ransom
January 15, 2019
*/
package ch43_03;
//scanner
import java.util.Scanner;
/**
 .*<h1>Palindrome Test!</h1>
 .* <p>this program tests whether an integer is a palindrome and if it isn't it returnes the flipped number</p>
 .* Created: January 17
 .* @author Colby Ransom
 .*
 */
public class Exercise_6_3 {
	/**
	 * <h2>Reverse the number</h2>
	 * <p>This method is used to return the reversed number of the input</p>
	 * <pre>Examples:
	 * {@code 	reverse(123) returns 321
	 * 	reverse(100) returns 001
	 * 
	 * }</pre>
	 * 
	 * @param number (int) Number being reversed
	 * @return reverse (int) The reversed number is returned
	 */
	public static int reverse (int number){
		//vars
		int reverse = 0;
		int remain = 0;
		
		//reverse while loop
		while (number != 0) {
			remain = number % 10;
			reverse = reverse * 10 + remain;		
			number = number /= 10;		
		}
		//return reverse output
		return reverse;
		
	}
	/**
	 *  <h3>Is it a Palindrome?</h3>
	 * <p>Checks the inputed number whether or not it is a Palindrome</p>
	 * <pre>Examples:
	 * {@code 123 returns false, 323 returns true
	 * }</pre>
	 * @param number (int) original input number in the main
	 * @param isPalindrome (boolean) returns true if the inputed number is a palidrome
	 */
	public static boolean isPalindrome(int number) {
		//vars
		boolean isPalindrome = false;
		int reverse = reverse(number);
		
		//check if Palindrome
		if (reverse == number) {
				isPalindrome = true;
		}		
		// return if Palindrome
		return isPalindrome;
	}
	/**
	 * <h4>Main</h4>
	 * <p>This is the main method which makes use of all the other methods</p>
	 * 
	 * @param args (String[]; unused)
	 * 
	 */
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		int user = 0;
		
		//input
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		//output
		System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
		System.out.println("Output is: " + reverse(user));
		
	}
}