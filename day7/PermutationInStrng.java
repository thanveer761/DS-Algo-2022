package day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class PermutationInStrng {
	@Test
	public void testCase1() {
		String s1 = "ab", s2 = "eidbaooo";
		boolean checkInclusion = checkInclusion(s1, s2);
		System.out.println(checkInclusion);
	}

	/*
	 * public boolean checkInclusion(String s1, String s2) {
	 * 
	 * if (s1.length() == 0) return true; int[] arr1 = new int[26]; int[] arr2 = new
	 * int[26];
	 * 
	 * for (int i = 0;i < s1.length();i++) { arr1[s1.charAt(i) - 'a']++;
	 * arr2[s2.charAt(i) - 'a']++; }
	 * 
	 * for (int i = s1.length();i < s2.length();i++) { if (Arrays.equals(arr1,
	 * arr2)) return true; arr2[s2.charAt(i-s1.length()) - 'a']--; arr2[s2.charAt(i)
	 * - 'a']++; } if (Arrays.equals(arr1, arr2)) return true; else return false; }
	 * }
	 */
	public boolean checkInclusion(String s1, String s2) {
		if (s2.length() == 0 || s1.length() > s2.length())
			return false;
		if (s1.length() == 0)
			return true;
		Map<Character, Integer> S1 = new HashMap<>(), S2 = new HashMap<>();
		for (char c : s1.toCharArray())
			S1.put(c, S1.getOrDefault(c, 0) + 1);
		int left = 0, right = 0;
		while (right < s2.length()) {
			int len = right - left + 1;
			char c = s2.charAt(right);
			S2.put(c, S2.getOrDefault(c, 0) + 1);
			if (len < s1.length()) {
				right++;
				continue;
			}

			if (len == s1.length()) {
				char end = s2.charAt(left);
				if (S1.equals(S2))	return true;
				else {
					S2.put(end, S2.get(end) - 1);
					if (S2.get(end) == 0)
						S2.remove(end);
				}
				left++;
				right++;
			}

		}
		return false;
	}
}
