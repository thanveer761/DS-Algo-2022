package day5;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstring {
	@Test
	public void example1() {
		String input = "abcabcbb";
		System.out.println(returnMaxSubstringLength(input));
	}

	@Test
	public void example2() {
		String input = "bbbbb";
		System.out.println(returnMaxSubstringLength(input));
	}

	@Test
	public void example3() {
		String input = "pwwkew";
		System.out.println(returnMaxSubstringLength(input));
	}

	// Pseudo Code
	/*
	 * initialize a set use 2 for loops. 1st one for starting of the substring and
	 * 2nd one for the end of substring in the second loop, add the characters to
	 * the set. once we find the character already present in the set, find the
	 * length of the substring and compare it with the previous length and break the
	 * loop finally return the max length of the substring
	 */
	private int returnMaxSubstringLength(String input) {

		int op = 0;
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				if (!set.add(input.charAt(j))) {
					op = Math.max(op, j - i);
					break;
				}
			}
			set.clear();
		}
		return op;

	}

}
