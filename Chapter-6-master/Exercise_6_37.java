/*
Colby Ransom
December 14, 2018
Write a method with the following header to format the integer with the specified width.
*/

//scanner
import java.util.Scanner;

class Exercise_6_37
{
	
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