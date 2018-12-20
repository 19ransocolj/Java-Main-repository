/*
Colby Ransom
November 28, 2018
pyrimid simulator
*/

//import junkie's junk
import java.util.Scanner;

class Exercise_5_17{
	public static void main(String[] args) {
		//Scanner
		Scanner Scan = new Scanner(System.in);
		int height = 0;
		
		//input rows
		System.out.print("Enter height of pyramid: ");
		height = Scan.nextInt();	
			
		//reprompt
		while (height > 15 || height < 1){
			System.out.print("Enter height of pyramid (1 - 15): ");
			height = Scan.nextInt();	

		}
		for (int row = 1; row <= height; row++){
			//spaces
			for (int space = 1; space <= (height - row ); space++){
				System.out.print("   ");
			}
			
			//left side
			for (int left = row; left >= 1; left --){
				System.out.printf("%3d", left);
			}
			
			//right side
			for (int right = 2; right <= row; right++){
				System.out.printf("%3d", right);
			}
			
			//end
			System.out.println();
		}
	}
}