/*
Colby Ransom
December 10, 2018
reverse number boat simulator
*/

//scanner
import java.util.Scanner;

class Exercise_6_3 {
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
	
	public static boolean isPalindrome(int number) {
		//vars
		boolean isPalindrome = false;
		int reverse = reverse(number);
		
		//check if palindrome
		if (reverse == number) {
				isPalindrome = true;
		}		
		// return if palindrome
		return isPalindrome;
	}
	
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