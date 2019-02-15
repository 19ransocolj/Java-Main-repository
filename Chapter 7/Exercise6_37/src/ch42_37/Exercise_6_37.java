/*
Colby Ransom

December 14, 2018
Write a method with the following header to format the integer with the specified width.
*/
package ch42_37;

//scanner
import java.util.Scanner;
/**
 * <h1>Class Exercise_6_37</h1>
 * <p>Program that formats the integer with the specified width</p>
 * Created: January 28
 * @author Colby Ransom
 */
public class Exercise_6_37
{
	/**
	 * <h2>Format the number length</h2>
	 * <p>This method is used to return the inputed number to that of the desired width</p>
	 * <pre>Examples:
	 * {@code 	format(123, 3) returns 123
	 * 	format(100, 4) returns 0100
	 * 
	 * }</pre>
	 * 
	 * @param number (int) Number changed to the desired width
	 * @param width (int) The length the number is changed to
	 * @return
	 */
	public static String format(int number, int width)
	{
		//vars
		int size = 0;
		String out = "";
		int number2 = number;
		
		//length size
		while (number2 > 0)
		{
			size += 1;
			number2 = number2 / 10;
		}
		
		// checking if zeros are nessesary
		if (size <= width)
		{
			width -= size;
			
			//adding nessesary zeros
			for ( int i = 0; i < width; i++)
			{
				out += "0";
			}
		}
		
		//adding number on the end
		out += Integer.toString (number);
		return out;
	}
	
	/**
	 * <h2>Main</h2>
	 * <p>This method gathers the input for the number and the width</p>
	 * 
	 * 
	 * @param args (String[]; unused)
	 */
	public static void main(String[] args)
	{
		//scanner
		Scanner input = new Scanner(System.in);
		
		//vars
		int number = 0;
		int width = 0;
		
		//input
		System.out.print("Enter a number: ");
		number = input.nextInt();
		System.out.print("Now enter it's desired width: ");
		width = input.nextInt();
		
		//output
		System.out.print(format(number, width));
		
	}
}