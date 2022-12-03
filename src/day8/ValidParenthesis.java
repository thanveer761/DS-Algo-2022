package day8;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesis {
	@Test
	public void example1() {
		String str = "()[[";
		
		Assert.assertEquals(false, Valid(str));
	}

	@Test
	public void example2() {
		String str = "([])";
		Assert.assertEquals(true, Valid(str));
	}

	public boolean Valid(String s) {
		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				st.push(c);
			} else {
				if(st.isEmpty()) {
					return false;
				}
				if ((c == ')' && st.peek() != '(') || (c == '}' && st.peek() != '{')
						|| (c == ']' && st.peek() != '[')) {
					return false;
				}
				st.pop();
			}
		}
		return st.empty();
	}
	public boolean isValidUsingMap(String s) {
		
		
		return false;
		
	}
}
