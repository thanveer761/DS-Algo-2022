package day2;



import java.util.Arrays;

import org.junit.Test;

public class CharacterOcc {

	@Test
	public void testCase1() {
		String s="loveleetcode";
		char c='e';
		int[] characte = characterName(s, c);
		
		System.out.println(Arrays.toString(characte));
	}
	
	public int[] characterName(String s, char c) {
		int len = s.length();
		
	int[] op= new int[len];
	int index=-len;
	
	for (int i = 0; i < len; i++) {
		if(s.charAt(i)==c) {
			index=i;
		}
		op[i]=i-index;
	}
	
	for (int i=len-1; i >=0; i--) {
		if(s.charAt(i)==c) {
			index=i;
		}
		op[i]=Math.min(op[i], Math.abs(i-index));
	}
	
	
	
	return op;
		
		
		

	}
}
