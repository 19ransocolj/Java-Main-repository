/*
Colby Ransom
November 19, 2018
program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total
*/
//scanner
import java.util.Scanner;

class Exercise_5_1 {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in); 
		
		// vars
		int negative = 0;
		int positive = 0;
		int input2  = 0;
		int total  = 0;
		
		//prompt input
		System.out.print("Enter a positive or negative number: ");
		input2 = input.nextInt();
		
		//loop
		while (input2 != 0){
			
			//check if positive or negative
			if (input2 < 0){
				negative += 1;
			} else {
				positive += 1;
			}
			
			total += input2;
			
			//prompt input again
			System.out.print("Enter a positive or negative number (0 to quit): ");
			input2 = input.nextInt();
			
		}
		//end of while loop
		
		//output
		System.out.println("Positive Numbers: " + positive);
		System.out.println("Negative Numbers: " + negative);
		System.out.println("The total is: " + total);
	}
}