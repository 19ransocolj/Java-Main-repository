/*
Colby Ransom
date: none yet
feb 7 2019
find the minimum element of an array
*/

//scanner
import java.util.Scanner;
class Ex_7_9 {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		double[]cookie = new double [10];
		
		//populate array
		
		for (int index = 0; index < 10; index++){
			System.out.print("Enter 1 double element: ");
			cookie[index] = input.nextDouble();
		}
		//call the min method
		System.out.println("The minimum element is " + min(cookie));
	}
	public static double min(double[] array){
		double min = 473.2;
		//search through array
		for (int i = 1; i < 10; i++){
			if (array[i] < min){
				min = array [i];
			}
		}
		//return min
		return min;
	}
}