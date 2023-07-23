// Java Program to Count Number of Vowels
// in a String in a iterative way

import java.io.*;

public class vowel {
	public static void main(String[] args)
		throws IOException
	{
		String str = "Shivam Raj Singh";
		str = str.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			// check if char[i] is vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
				|| str.charAt(i) == 'i'
				|| str.charAt(i) == 'o'
				|| str.charAt(i) == 'u') {
				// count increments if there is vowel in
				// char[i]
				count++;
			}
		}

		// display total count of vowels in string
		System.out.println(
			"Total no of vowels in string are: " + count);
	}
}
