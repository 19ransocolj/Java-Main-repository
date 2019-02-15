/*
Colby Ransom
date: none yet
feb 7 2019
Locker Junk
*/

//scanner
import java.util.Scanner;
class Ex_7_23 {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		boolean[]lockers = new boolean [100];
		
		//student opening and closing
		for (int student = 1; student < 100; student++){
			//opening/closing every # of student locker
			for (int i = 0; i < 100;){
					//changing the picked lockers
					if (lockers[i] == true){
					lockers[i] = false;
					}
					else {
					lockers[i] = true;
					}
					i += student;
			}
	
		}
		//display
		for (int l = 0; l < 100; l++){
			System.out.print(l+1 + "=" + lockers[l] + " ");
			
	}}
}