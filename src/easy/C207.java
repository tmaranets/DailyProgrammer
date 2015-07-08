/*
	/r/dailyprogrammer
	[2015-03-23] Challenge #207 [Easy] Bioinformatics 1: DNA Replication
	@author	- Theodore Maranets
*/
package easy;

import java.util.Scanner;

public class C207 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(getComp(in.nextLine()));
		in.close();
	}
	public static String getComp(String strand)
	{
		String ret = "";
		for (int i = 0; i < strand.length(); i += 2)
		{
			if (strand.charAt(i)=='A')
				ret += "T ";
			if (strand.charAt(i)=='T')
				ret += "A ";
			if (strand.charAt(i)=='G')
				ret += "C ";
			if (strand.charAt(i)=='C')
				ret += "G ";
		}
		return ret;
	}
}
