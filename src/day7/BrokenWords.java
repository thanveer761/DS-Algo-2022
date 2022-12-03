package day7;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BrokenWords {
	@Test
	public void testCase1() {
		String text = "hello world", brokenLetters = "ad";
		int brokenWords = brokenWords(text, brokenLetters);
		Assert.assertEquals(brokenWords, 1);
	}

	public int brokenWords(String text, String brokenLetters) {
		Set<Character> set = new HashSet<>();
		for (char ch : brokenLetters.toCharArray())
			set.add(ch);
		String[] words = text.split(" ");
		int count = words.length;
		for (String word : words) {
			for (char ch : word.toCharArray()) {
				if (set.contains(ch)) {
					count--;
					break;
				}
			}
		}
		return count;

	}
}
