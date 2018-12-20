/*
Colby Ransom
December 10, 2018
the matrix
*/

//scanner
import java.util.Scanner;

class Exercise_6_17 {
	
	public static void printMatrix(int in){
		//vars
		int randnum = 0;
		
		//print for loop
		for (int row = 0; row < in; row++){
			for (int col = 0; col < in; col++){
				randnum = (int) (Math.random()* 2)+ 0;
				System.out.print(randnum + " ");
			}
			System.out.println("");
		}
	}
		
		
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		int in = 0;
		
		//input
		System.out.print("Enter n: ");
		in = input.nextInt();
		System.out.println("");
		
		//output
		printMatrix(in);
	}
}