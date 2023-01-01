package substing;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubString {

	@Test
	public void testCase1() {
		String s = "YazaAay";

		String op = longestNiceSubstring(s);
		System.out.println(op);
	}

	/*
	 * Given a string s and a number k, find the maximum number of vowels in
	 * substring of size k. String s: "workaattech" k: 3 /*pseudocode:
	 * 
	 * 
	 */
	public String longestNiceSubstring(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				// get the substring for the index range from i to j
				String temp = s.substring(i, j);

				if (temp.length() > 1 && result.length() < temp.length() && checkNice(temp))
					result = temp;
			}
		}
		return result;
	}

	// validate Nice String check
	public boolean checkNice(String temp) {
		// add substring to the set
		Set<Character> s = new HashSet<>();
		for (char ch : temp.toCharArray())
			s.add(ch);
		for (char ch : s)
			if (s.contains(Character.toUpperCase(ch)) != s.contains(Character.toLowerCase(ch)))
				return false;
		return true;
	}
}
//2 pointers
/*
 * public String longestNiceSubString(String s) { Set<Character> set = new
 * HashSet<Character>(); if (s.length() < 2) return "";
 * 
 * for (char c : s.toCharArray()) set.add(c);
 * 
 * for (int i = 0; i < s.length(); i++) { if
 * (set.contains(Character.toUpperCase(s.charAt(i))) &&
 * set.contains(Character.toLowerCase(s.charAt(i)))) { continue; }
 * 
 * String s1 = longestNiceSubString(s.substring(0, i)); String s2 =
 * longestNiceSubString(s.substring(i + 1));
 * 
 * return s1.length() >= s2.length() ? s1 : s2; }
 * 
 * return s;
 * 
 * } }
 */
