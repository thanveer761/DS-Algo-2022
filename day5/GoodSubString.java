package day5;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GoodSubString {
	@Test
	public void testCase1() {
		String s = "xyzzaz";
		int goodSub = goodSub(s);
		System.out.println(goodSub);
	}

	@Test
	public void testCase2() {
		String s = "aababcabc";
		int goodSub = goodSub(s);
		System.out.println(goodSub);
	}
	//o[N]
	/*public int goodSub(String s) {
		int ans = 0;
		for(int i = 0;i<s.length()-2;i++)
		{
		if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2))
		ans++;
		}
		return ans;
	}*/
	
	//o[N]
		public int goodSub(String s) {
			 int c=0;
		        for(int i=0;i<(s.length()-2);i++){
		            Set<Character> set=new HashSet<>();
		            set.add(s.charAt(i));
		            set.add(s.charAt(i+1));
		            set.add(s.charAt(i+2));
		            if(set.size()==3)c++;
		        }
		        return c;
		}
}
