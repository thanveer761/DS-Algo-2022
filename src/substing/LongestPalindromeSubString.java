package substing;

import org.junit.Test;

public class LongestPalindromeSubString {
	/*
	 * 1) Did I understand the problem? Yes -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? No
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */

	@Test
	public void testCase1() {
		String s="babad";
		String reversePalindrome = longestPalindrome(s);
		System.out.println(reversePalindrome);
		
	}
	
	/*Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String s: "workaattech"
	k: 3
	/*pseudocode:
	 * 
	 * 
	 */
//2 pointers
	 public String longestPalindrome(String s) {
	        String res = "";
	        for (int i = 0; i < s.length(); i++) {   
				//find the longestPalindrome center at s[i] (odd length)
	            String s1 = palindrome(s, i, i); 
				//find the longestPalindrome center at s[i] and s[i + 1] (even length) 
	            String s2 = palindrome(s, i, i + 1);
				//update the res to the longest palindrome with s1, s2
	            res = res.length() > s1.length() ? res : s1;
	            res = res.length() > s2.length() ? res : s2;
	        }
	        return res;
	        
	 }
	        private String palindrome(String s, int l, int r) {
	            while (l >= 0 && r < s.length()  //set the searching boundary
	                    && s.charAt(l) == s.charAt(r)) { //check palindrome
	                 l--;
	                 r++;
	             }
	             return s.substring(l + 1, r);
	         }
	  
	    }
