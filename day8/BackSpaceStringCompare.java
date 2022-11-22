package day8;

import java.util.Stack;

import org.junit.Test;

public class BackSpaceStringCompare {

	@Test
	public void test1() {
		String s = "ab#c", t = "ad#c";
boolean op = backspaceCompare(s, t);
System.out.println(op);
	}

	@Test
	public void test2() {

		String s = "a#c", t = "b";
		boolean op = backspaceCompare(s, t);
		System.out.println(op);
	}

	
	
	public boolean backspaceCompare(String s, String t) {
        return backspaced(s).equals(backspaced(t));
    }

    public String backspaced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }
}
