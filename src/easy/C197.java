/*
	/r/dailyprogrammer
	[2015-01-12] Challenge #197 [Easy] ISBN Validator
	@author	- Theodore Maranets
*/
package easy;

import java.util.Scanner;

public class C197 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(isValid(in.nextLine()));
		in.close();
	}
	public static String isValid(String num)
	{
		int sum = 0;
		int x = 10;
		for (int i = 0; i < num.length(); i++)
		{
			if (Character.isDigit(num.charAt(i)))
			{
				sum += (x*Integer.parseInt(num.charAt(i) + ""));
				x--;
			}
			if (num.charAt(i)=='X') //for when a digit is meant to be 10
			{
				sum += (x*10);
				x--;
			}
		}
		if (sum % 11 == 0)
			return "Valid";
		else
			return "Invalid";
	}

}
