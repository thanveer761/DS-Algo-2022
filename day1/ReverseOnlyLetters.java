package day1;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLetters {
	@Test
	public void testCase1() {
		String s="ab-cd";
		String op = revOnlyLetters(s);
		Assert.assertEquals("dc-ba",op);
	}
	@Test
	public void testCase2() {
		String s="a-bC-dEf-ghIj";
		String op = revOnlyLetters(s);
		Assert.assertEquals("j-Ih-gfE-dCba",op);
	}
	@Test
	public void testCase3() {
		String s="Test1ng-Leet=code-Q!";
		String op = revOnlyLetters(s);
		Assert.assertEquals("Qedo1ct-eeLg=ntse-T!",op);
	}


	//2 pointers o[n^2]
	public String revOnlyLetters(String s) {
		char[] ch = s.toCharArray();
	int	left=0,right=ch.length-1;
	while(left<=right) {
		if(Character.isLetter(ch[left])&&Character.isLetter(ch[right])) {
			char temp = ch[left];
			ch[left++]=ch[right];
			ch[right--]=temp;
		}else if(!Character.isLetter(ch[left])&&Character.isLetter(ch[right])) {
			left++;
		}else 
			right--;
	}
		
		return String.valueOf(ch);
		
		
	
}
}