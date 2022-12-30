package palindrome;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeII {

	@Test // positive
	public void testCase1() {
		String s = "aba";
		boolean validPalindromeII = validPalindromeII(s);
		Assert.assertTrue(validPalindromeII);
	}

	@Test // edge
	public void testCase2() {
		String s = "abca";
		boolean validPalindromeII = validPalindromeII(s);
		Assert.assertTrue(validPalindromeII);
	}

	@Test // negative
	public void testCase3() {
		String s = "abc";
		boolean validPalindromeII = validPalindromeII(s);
		Assert.assertFalse(validPalindromeII);
	}
	/*
	 * pseudocode: 2pointer Algorithm Step 1: Validate the Palidrome by boolean
	 * check method as isPalindrom initialize two variable as i & j if strings first
	 * index matches i & j increment i and decrement j return true; else return
	 * false Step 2: initialze two variable from left and right index convert s to
	 * tocharArray if left matches right increment left and decrement right return
	 * true; else increment left+1 or decrement right-1
	 * 
	 * 
	 */

	// 2 pointer Approach-->Time Complexity=O[N], Space Complexity=o[1]
	/*public boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;

	}

	public boolean validPalindromeII(String s) {

		int left = 0, right = s.length() - 1;
		char[] ch = s.toCharArray();
		while (left < right) {
			if (ch[left] == ch[right]) {
				left++;
				right--;
			} else
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
		}
		return true;

	}*/

	public boolean validPalindromeII(String s) {
		if (isPalindrome(s)) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			StringBuilder stringBuilder = new StringBuilder(s);

			StringBuilder temp = stringBuilder.deleteCharAt(i);
			String s1 = temp.toString();
			if (isPalindrome(s1)){
				return true;
			}  
		}
		return false;
	}

	public boolean isPalindrome(String s) {
		if (s.length() == 0) {
			return true;
		}
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}
}
