/*
Colby Ransom
11/5/2018
Financial payroll program
*/

//import junk
import java.util.Scanner;

class Exercise_4_23 {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		String name = "";
		double hrsWorked = 0.0;
		double hrlyRate = 0.0;
		double fedTax = 0.0;
		double stTax = 0.0;
		double grossPay = 0.0;
		double netPay = 0.0;
		double fedWithdrawl = 0.0;
		double stWithdrawl = 0.0;
		double totDeduction = 0.0;
		
	//input
		// employee name
		System.out.print("Enter employee's name: ");
		name = input.next();
		
		//hours worked
		System.out.print("Enter number of hours worked: ");
		hrsWorked = input.nextDouble();
		
		//pay rate
		System.out.print("Enter pay rate: $");
		hrlyRate = input.nextDouble();
		
		//fed tax
		System.out.print("Enter federal tax withholding rate: ");
		fedTax = input.nextDouble();
		
		//state tax
		System.out.print("Enter State withholding rate: ");
		stTax = input.nextDouble();
		
		//math
		grossPay = hrsWorked * hrlyRate;
		fedWithdrawl = grossPay * fedTax;
		stWithdrawl = grossPay * stTax;
		totDeduction = stWithdrawl + fedWithdrawl;
		netPay = grossPay - fedWithdrawl - stWithdrawl;
		
		//Rounding
		netPay = Math.round(netPay * 100D) / 100D;
		stWithdrawl = Math.round(stWithdrawl * 100D) / 100D;
		totDeduction = Math.round(totDeduction * 100D) / 100D;
		
		//Output
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hrsWorked);
		System.out.println("Pay Rate: " + hrlyRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("	Federal Withholding (" + (fedTax * 100) + "%): " + fedWithdrawl);
		System.out.println("	State Withholding (" + (stTax * 100) + "%): " + stWithdrawl);
		System.out.println("	Total Deduction: $" + totDeduction);
		System.out.println("Net Pay: " + netPay);
		
	}
		
}

