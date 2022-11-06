package day5;

import org.junit.Test;

public class CountOccOfString {
	@Test
	public void testCase1() {
		String s = "ZAAVVDDSSSG";
		//1Z2A2V2D3S1G
		String countOcc = countOcc(s);
		System.out.println(countOcc);
	}

	
	public String countOcc(String s) {
StringBuilder builder = new StringBuilder();
		int  count=0,left =0,right=0;
		char[] ch = s.toCharArray();
		while(right<s.length()) {
			if(ch[left]==ch[right]) {
				count++;
				right++;
			}
			else if(ch[left]!=ch[right])
			{
				builder.append(count+"");
				builder.append(ch[left]);
				count=0;
				left=right;
			}
			
		}
		builder.append(count+"");
		builder.append(ch[left]);
		
		return builder.toString();
		

	}
}
