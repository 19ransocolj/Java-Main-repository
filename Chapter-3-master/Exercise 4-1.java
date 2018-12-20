/*
Colby Ransom
10/26/2018
calculate area of pentagon
*/

// import required junk
import java.util.Scanner;

class Exercise_4_1 {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		double r = 0.0;
		double s = 0.0;
		double area = 0.0;
		
		//input
		System.out.print("Enter the length form the center to the center of the vertex: ");
		
		//math
		r = input.nextDouble();
		s = (r + r) * Math.sin(Math.PI / 5);
		area = 5 * s * s / (4 * Math.tan(Math.PI /5));
		//output
		System.out.print ("The area of the pentagon is: " + area);
	}
}