/*
Author: Rocky Mazorow
Date: 9/27/2018

This is an example of how to use a Scanner to solve for the area of a rectangle
*/

import java.util.Scanner;

class ScannerExample {
	public static void main(String[] args) {
		// declare variables
		Scanner input = new Scanner(System.in);
		double side1 = 0.0;
		double side2 = 0.0;
		double area  = 0.0;
		
		// Prompt user
		System.out.println("We are going to solve for the area of a rectangle!");
		System.out.print("Enter the length of side 1: ");
		side1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		side2 = input.nextDouble();
		
		// Solve for area
		area = side1 * side2;
		
		// Display results
		System.out.println("The area of this rectangle is " + area);
	}
}