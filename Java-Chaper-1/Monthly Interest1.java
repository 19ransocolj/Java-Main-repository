
/*
Colby Ransom
10/1/2018
Monthly interest program
*/

//import chicken nuggets
import java.util.Scanner;

class Monthly_Interest {
	public static void main(String[] args) {
		// vars
		Scanner input = new Scanner(System.in);
		
		double interest_rate = 1.00417;
		double savings_per_month = 0.0;
		double subtotal_1 = 0.0;
		
		//ask
		System.out.print("Enter monthly saving amount: ");
		savings_per_month = input.nextDouble();
		
		//math 
			//1st month
			subtotal_1 = (interest_rate * savings_per_month);
			
			//2nd month
			subtotal_1 = ( ( subtotal_1 + savings_per_month ) * interest_rate );
			
			//3rd month
			subtotal_1 = ( ( subtotal_1 + savings_per_month ) * interest_rate );
			
			//4th month
			subtotal_1 = ( ( subtotal_1 + savings_per_month ) * interest_rate );
			
			//5th month
			subtotal_1 = ( ( subtotal_1 + savings_per_month ) * interest_rate );
	
			//6th month
			subtotal_1 = ( ( subtotal_1 + savings_per_month ) * interest_rate );
		
		//output
		System.out.print("Savings after 6th month: " + subtotal_1);
			
		
		
		
		
	}
}