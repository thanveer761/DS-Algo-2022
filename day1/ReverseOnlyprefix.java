package day1;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyprefix{
	@Test
	public void testCase1() {
		String s="xyxzxe";
		char ch= 'z';
		String op = reverseOnlyprefix(s, ch);
		Assert.assertEquals("zxyxxe",op);
	}
	@Test
	public void testCase2() {
		String s="abcdefd";
		char ch= 'd';
		String op = reverseOnlyprefix(s, ch);
		Assert.assertEquals("dcbaefd",op);
	}
	
	/*pseudocode:
	 * 
	 * 
	 */

	//2 pointers o[n^2]
	public String reverseOnlyprefix(String s,char ch) {
		 StringBuilder sb = new StringBuilder();
	        int index = 0;
	        for(int i = 0; i < s.length(); i++){
	            if(s.charAt(i) == ch){
	                index = i;
	                break;
	            }
	        }
	        for(int i = index; i >= 0; i--){
	            sb.append(s.charAt(i));
	        }
	        for(int i = index + 1; i < s.length(); i++){
	            sb.append(s.charAt(i));
	        }
	        return sb.toString();
	
	
}
}
