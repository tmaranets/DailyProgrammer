/*
	/r/dailyprogrammer
	[2015-07-13] Challenge #223 [Easy] Garland words
	
	enable1.txt	- https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt
*/
package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C223 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(garland(in.next()));
		in.close();
	}
	public static int garland(String word)
	{
		word = word.toLowerCase();
		for (int c = word.length()-1; c >= 0; c--)
		{
			if (word.substring(0, c).equals(word.substring(word.length()-c)))
				return c;
		}
		return 0;
	}
	//Some of the Optional Challenges
	public static void printChain(String word)
	{
		int b = garland(word);
		if (b==0)
			System.out.println(word);
		for (int i = 1; i <= 20; i++) //chosen chain length is 20
		{
			if (i==20)
				System.out.print(word);
			else
				System.out.print(word.substring(0,word.length()-b));
		}
	}
	public static int findLarge() throws FileNotFoundException //the enable1.txt file must be in the Java project directory
	{
		Scanner scan = new Scanner(new File("enable1.txt"));
		int max = 0;
		while (scan.hasNext())
		{
			int deg = garland(scan.next());
			if (deg > max)
				max = deg;
		}
		scan.close();
		return max;
	}

}
