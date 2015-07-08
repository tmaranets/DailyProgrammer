/*
	/r/dailyprogrammer
	[11/4/13] Challenge #139 [Easy] Pangrams
	@author	- Theodore Maranets
*/
package easy;

import java.util.Scanner;

public class C139 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(isPangram(in.nextLine()));
		in.close();
	}
	public static boolean isPangram(String sen)
	{
		String alpha = "abcedfghijklmnopqrstuvwxyz"; //the alphabet
		for (int i = 0; i < alpha.length(); i++)
		{
			boolean found = false;
			for (int u = 0; u < sen.length(); u++) //iterates through the sentence's characters
			{
				if (Character.toLowerCase(sen.charAt(u)) == alpha.charAt(i))
					found = true;
			}
			if (!found) //if a letter is not found, the validation will stop
				return false;
		}
		return true;
	}
}
