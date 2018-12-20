/*
Colby Ransom
10/26/2018
program that checks if point is in rectangle
*/

// import scanner
import java.util.Scanner;


class Untitled {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		//n/a
		
		//input
		System.out.print("Enter a X cordinate: ");
		double x1 = input.nextDouble();
		System.out.print("Enter a Y cordinate: ");
		double y1 = input.nextDouble();
		
		//check
		if (x1 > -5.0 && x1 < 5.0){
			if (y1 > -2.5 && y1 < 2.5){
				System.out.println("Cordinates inside of rectangle.");
			}
		} else {
			System.out.println("Cordinates outside of rectangle.");
		}
		
	}
}