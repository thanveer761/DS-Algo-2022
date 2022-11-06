package day5;

import org.junit.Test;

public class FirstUniqueCharactOfString {
	@Test
	public void testCase1() {
		String s = "loveleetcode";
		int firstUniqueCharact = firstUniqueCharact(s);
		System.out.println(firstUniqueCharact);
	}

	@Test
	public void testCase2() {
		String s = "love";
		int firstUniqueCharact = firstUniqueCharact(s);
		System.out.println(firstUniqueCharact);
	}
	
	/*traverse through nested with i & j as 0 loop
	 * make boolean condition as false
	 * if charat i & j equals 
	 * make as cond as true and break
	 * if condition doesn't match return i
	 * else return -1
	 * 
	 * 
	 */

public int firstUniqueCharact(String s) {
	for(int i=0;i<s.length();i++){
		boolean cond=false;
		for(int j=0;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j)&&(i!=j)){
				cond=true;
				break;
			}
			}
		if(!cond){
			return i;
			}
		}
	return -1;
	
	}
		
}
