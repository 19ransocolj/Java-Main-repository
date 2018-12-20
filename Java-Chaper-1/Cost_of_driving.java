/*
Colby Ransom
10/5/2018
Cost_of_driving program
*/

//import batman
import java.util.Scanner;
class Cost_of_driving {
	public static void main(String[] args) {
	// vars
	Scanner input = new Scanner(System.in);
	double driving_distance = 0.0;
	double miles_per_gallon = 0.0;
	double price_per_gallon = 0.0;
	double costofdriving = 0.0;
	
	//ask
		//driving dist.
	System.out.print("Enter Driving distance: ");
	driving_distance = input.nextDouble();
	System.out.println();
	
		//miles per gallon
	System.out.print("Enter Miles per Gallon: ");
	miles_per_gallon = input.nextDouble();
	System.out.println();
	
		//price per gallon
	System.out.print("Enter Price per Gallon: ");
	price_per_gallon = input.nextDouble();
	System.out.println();
	
	//math
	costofdriving = ((driving_distance/miles_per_gallon)*price_per_gallon);
	
	
	//out 
	System.out.println("The cost of driving is $" + costofdriving);
	}
}