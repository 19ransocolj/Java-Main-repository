/*
Colby Ransom
November 15, 2018
program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. Numbers are separate by exactly one space.
*/
//scanner not needed
class Exercise_5_11 {
	public static void main(String[] args) {
		//vars
		int number = 100;
		int lineNum = 0;
		
		//while loop
		while (number < 201 )
		{
			if (number% 5 == 0 ^ number% 6 == 0){
				lineNum += 1;
				if (lineNum == 10){
					System.out.println(number + " ");
					lineNum = 0;
				} else {//end of line number check if statment
					System.out.print(number + " ");
				}//end of else line num if statment
				
			}//end of number compatability if statement
			number +=1;
			
		}//end of while loop
		
	}
}