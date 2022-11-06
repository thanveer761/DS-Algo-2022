package day4;

import org.junit.Test;

public class LongestNiceSubString {
	

	@Test
	public void testCase1() {
		String s="YazaAay";
		
		longestNiceSubString(s);
	}
	
	/*Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String s: "workaattech"
	k: 3
	/*pseudocode:
	 * 
	 * 
	 */
//2 pointers
	 public String longestNiceSubString(String s) {
		 
	String op="";
		 for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i)!=s.charAt(j)) {
					i++;
					j++;
				}else
					
			}
		}
		 
		 System.out.println(op);
		return op;
		
	 }
}
