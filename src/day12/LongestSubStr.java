package day12;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubStr {
@Test
public void td1() {
	String s="pwwkew";
	int longestSubStr = longestSubStr(s);
System.out.println(longestSubStr);
}
@Test
public void td2() {
	String s="bbbbb";
	int longestSubStr = longestSubStr(s);
	System.out.println(longestSubStr);

}
public int longestSubStr(String s) {
	int max=Integer.MIN_VALUE;
	int l=0,r=0;
	Set<Character> sm = new HashSet<>();
	while(r<s.length()){
	char c=s.charAt(r);
	if(!sm.contains(c)){
	sm.add(c);
	r++;
	max=Math.max(max, sm.size());
	}else {
	sm.remove(s.charAt(l));
	l++;
	}
	}

return max;
}
}
