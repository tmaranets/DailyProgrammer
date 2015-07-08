/*
	/r/dailyprogrammer
	[2015-04-27] Challenge #212 [Easy] Rövarspråket
	@author	- Theodore Maranets
*/
package easy;

import java.util.Scanner;

public class C212 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println(encryptLine(in.nextLine()));
		in.close();
	}
	public static String encryptLine(String line)
	{
		Scanner scan = new Scanner(line);
		String ret = "";
		while (scan.hasNext())
			ret += encryptWord(scan.next()) + " ";
		scan.close();
		return ret;
	}
	public static String encryptWord(String word)
	{
		String ret = "";
		for (int i=0; i < word.length(); i++)
		{
			if ("qwrtypsdfghjklzxcvbnm".contains(word.toLowerCase().charAt(i)+"")) //all of the consonants, so the code doesn't mess with Swedish vowels
			{
				if (Character.isUpperCase(word.charAt(i))) //makes sure upper case ciphers are not repeated
					ret += word.charAt(i) + "o" + Character.toLowerCase(word.charAt(i));
				else
					ret += word.charAt(i) + "o" + word.charAt(i);
			}
			else
				ret += word.charAt(i);
		}
		return ret;
	}
	//Bonus: Decrypting a Rövarspråket sentence
	public static String decryptLine(String line)
	{
		Scanner scan = new Scanner(line);
		String ret = "";
		while (scan.hasNext())
			ret += decryptWord(scan.next()) + " ";
		scan.close();
		return ret;
	}
	public static String decryptWord(String word)
	{
		String ret = "";
		for (int i = 0; i < word.length(); i++)
		{
			if ("qwrtypsdfghjklzxcvbnm".contains(word.toLowerCase().charAt(i)+""))
			{
				ret += word.charAt(i); //adds only the consonant and skips over the Rövarspråket characters
				i += 2;					
				if (i >= word.length())
					break;
			}
			else
				ret += word.charAt(i);
		}
		return ret;
	}
}
