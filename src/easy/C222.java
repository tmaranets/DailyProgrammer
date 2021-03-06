/*
	/r/dailyprogrammer
	[2015-07-06] Challenge #222 [Easy] Balancing Words
*/
package easy;

import java.util.Scanner;

public class C222 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(balance(in.next()));
		in.close();
	}
	public static String balance(String ns)
	{
		for (int bp = 0; bp < ns.length(); bp++) //iterates through all possible breakpoints
		{
			String s1 = ns.substring(0,bp); //substring up to breakpoint
			String s2 = ns.substring(bp+1); //substring after breakpoint
			if (sumLeft(s1) == sumRight(s2))
			{
				return s1 + " " + ns.charAt(bp) + " " + s2 + " - " + sumLeft(s1);
			}
		}
		return ns + " DOES NOT BALANCE";
	}
	//sums generated by casting the characters of a string to their ASCII values
	//and then multiplying by the character's respective distance from the breakpoint
	public static int sumLeft(String s1) 
	{
		int sum = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			sum += (((int)s1.charAt(i))-64) * (s1.length()-i); 
		}
		return sum;
	}
	public static int sumRight(String s2) 
	{
		int sum = 0;
		for (int i = 0; i < s2.length(); i++)
		{
			sum += (((int)s2.charAt(i))-64) * (i+1);
		}
		return sum;
	}
}
