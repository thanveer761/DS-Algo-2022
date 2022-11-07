package day4;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubString {
	

	@Test
	public void testCase1() {
		String s="YazaAay";
		
		String op = longestNiceSubString(s);
		System.out.println(op);
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
		 
		 if(s.length()<2) return "";  
	        
	        Set<Character> set = new HashSet<>();
	        for(char c : s.toCharArray())  set.add(c);
	        
	        for(int i=0;i<s.length();i++){
	            if(set.contains(Character.toUpperCase(s.charAt(i))) &&  set.contains(Character.toLowerCase(s.charAt(i)))){
	                continue;
	            }
	            
	            String s1 = longestNiceSubString(s.substring(0,i));
	            String s2 = longestNiceSubString(s.substring(i+1));
	            
	            return s1.length()>=s2.length() ? s1 : s2;
	        }
	        
	        return s;
		
	 }
}
