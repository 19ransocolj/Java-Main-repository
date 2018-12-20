/*
Colby Ransom
9/27/2018
Celsius to Fahrenheit convertor
*/

//import junk
import java.util.Scanner;

class Celsius_to_Fahrenheit {
	public static void main(String[] args) {
		
		//vars
		Scanner input = new Scanner(System.in);
		double fahrenheit = 0.0;
		double celsius = 0.0;
		
		//ask
		System.out.print("To calculate Fahrenheit enter Celsius: ");
		celsius = input.nextDouble();
		System.out.println();
		
		//solve
		fahrenheit = ( ((9.0 / 5) * celsius) + 32 );
		System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
		
	}
}