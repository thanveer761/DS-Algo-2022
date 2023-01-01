package substing;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubStringWithoutRepeatingCharac {

	@Test
	public void testCase1() {
		String s = "abcabcbb";

		int op = longestNiceSubString(s);
		System.out.println(op);
	}

	/*
	 * Given a string s and a number k, find the maximum number of vowels in
	 * substring of size k. String s: "workaattech" k: 3 /*pseudocode:
	 * 
	 * 
	 */
//2 pointers
	public int longestNiceSubString(String s) {
		 int left = 0, right = 0, max = 0;
	        Set<Character> set = new HashSet<>();
	        
	        while(right <= left && left < s.length()) {
	            if(!set.contains(s.charAt(left))) {
	                set.add(s.charAt(left));
	                max = Math.max(max, set.size());
	                left++;
	            }else {
	                set.remove(s.charAt(right));
	                right++;
	            } 
	        }
			
	        return Math.max(max, set.size());

	}
}
