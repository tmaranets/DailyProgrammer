/*
	/r/dailyprogrammer
	[02/24/14] Challenge #149 [Easy] Disemvoweler
	@author	- Theodore Maranets
*/
package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class C149 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(disemvoweler(in.nextLine()));
		in.close();
	}
	public static String disemvoweler(String line)
	{
		String ret = "";
		ArrayList<Character> removed = new ArrayList<>();
		for (int i = 0; i < line.length(); i++)
		{
			if ("euioa".contains(line.toLowerCase().charAt(i)+"")) //all vowels added to the array list
				removed.add(line.charAt(i)); 
			else if (line.charAt(i) == ' ') {}
			else
				ret += line.charAt(i); //character added only if it is not a vowel or a space
		}
		String rem = ""; //adding the vowels to 1 string
		for (int i = 0; i < removed.size(); i++)
			rem += removed.get(i);
		return ret + "\n" + rem;
	}
}
