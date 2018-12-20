/*
Colby Ransom
10/26/2018
calculate days in month w/ leap year factor
*/

// import required junk
import java.util.Scanner;

class Exercise_4_17 {
	public static void main(String[] args) {
		
//scanner
		Scanner input = new Scanner(System.in);
		
//vars
		String month = "";
		int days = 0;
		int year = 0;
		boolean isLeapYear = false;
		
//input
		System.out.print("Enter a year: ");
		year = input.nextInt();
		System.out.println("Enter a month (First three letters only with first letter capalized ex. Jan): ");
		month = input.next();
		
//check if valid month input
		
//January
		if (month .equals("Jan")){
			days = 31;
			System.out.print("There are " + days + " in this month.");
			
//Febuary
		} else if (month .equals("Feb")){
//leap year check
			isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear == false){
//not leap year
				days = 28;
				System.out.print("There are " + days + " days in this month.");
			} else {
// is leap year
				days = 29;
				System.out.print("There are " + days + " days in this month.");
			}
			
//March
		} else if (month .equals( "Mar")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//April
		} else if (month .equals( "Apr")){
			days = 30;
			System.out.print("There are " + days + " days in this month.");
			
//May
		} else if (month .equals( "May")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//June
		} else if (month .equals( "Jun")){
			days = 30;
			System.out.print("There are " + days + " days in this month.");
			
//July
		} else if (month .equals( "Jul")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//August
		} else if (month .equals( "Aug")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//September
		} else if (month .equals( "Sep")){
			days = 30;
			System.out.print("There are " + days + " days in this month.");
			
//October
		} else if (month .equals( "Oct")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//November
		} else if (month .equals( "Nov")){
			days = 30;
			System.out.print("There are " + days + " days in this month.");
			
//December
		} else if (month .equals( "Dec")){
			days = 31;
			System.out.print("There are " + days + " days in this month.");
			
//not any correct month
		}else {
			System.out.println("Incorrect input, too many letters or not capalized.");
		}
	}
}