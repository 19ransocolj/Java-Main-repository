/*
Colby Ransom
10/24/2018
program that checks if valid triangle
*/

// import chocolate nuggets
import java.util.Scanner;

class Exercise_3_3 {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		double perimiter = 0.0;
		
		//ask
		System.out.print("Enter side 1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side 2: ");
		double side2 = input.nextDouble();
		
		System.out.print("Enter side 3: ");
		double side3 = input.nextDouble();
		
		//math
		perimiter = side1 + side2 + side3;
		
		//verification
		if (side1 + side2 < side3)
			{
				System.out.println("Not a triangle");
				
				
			} else {
					System.out.println("Valid triangle");
					System.out.print("Perimiter: "+perimiter);			
				}
	}
}