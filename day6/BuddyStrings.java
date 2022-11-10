package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BuddyStrings {
	@Test
	public void testCase1() {
		String s = "ab";
		String goal = "ba";
		 boolean op = buddyStrings(s, goal);
		System.out.println(op);
	}

	public boolean buddyStrings(String s, String goal) {
		  if (s.length() != goal.length()) return false;
	        if (s.equals(goal)){
	            Set<Character> set = new HashSet<>();
	            for (char c : s.toCharArray())
	                set.add(c);
	            return set.size() < s.length();
	        }
	        else{
	            List<Integer> list = new ArrayList<>();
	            for (int i = 0;i<s.length();i++)
	                if (s.charAt(i) != goal.charAt(i)) list.add(i);
	            return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && goal.charAt(list.get(0)) == s.charAt(list.get(1));
	        }
	}
}
