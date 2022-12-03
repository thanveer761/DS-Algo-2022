package day7;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DupCharInString {
	@Test
	public void testCase1() {
		String text = "aba";
		String dupChar = dupChar(text);
		System.out.println(dupChar);
	}

	@Test
	public void testCase2() {
		String text = "zz";
		String dupChar = dupChar(text);
		System.out.println(dupChar);
	}

	@Test
	public void testCase3() {
		String text = "codeility";
		String dupChar = dupChar(text);
		System.out.println(dupChar);
	}

	public String dupChar(String s) {
		/*
		 * char[] ch = s.toCharArray(); String op=" "; for (int i = 0; i < ch.length;
		 * i++) { for (int j = i+1; j < ch.length; j++) { if(ch[i]==ch[j]) {
		 * op=op+ch[j]; } } } return op;
		 */
		String op = "";
		char[] ch = s.toCharArray();
		Set<Character> sp = new HashSet<>();
		for (Character c : ch) {
			if (!sp.add(c)) {
				op = op + c;
			}

		}
		return op;
	}
}
