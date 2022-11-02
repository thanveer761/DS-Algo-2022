package day5;

import java.util.HashMap;


import org.junit.Assert;
import org.junit.Test;

public class IsoMorphicStrings {
	@Test
	public void testCase1() {
		String s = "egg";
		String t = "add";
		boolean True = isoMorphicStrings(s, t);
		Assert.assertTrue(True);

	}

	@Test
	public void testCase2() {
		String s = "foo";
		String t = "bar";
		boolean False = isoMorphicStrings(s, t);
		Assert.assertFalse(False);
	}

	@Test
	public void testCase3() {
		String s = "paper";
		String t = "title";
		boolean True = isoMorphicStrings(s, t);
		Assert.assertTrue(True);
	}

	public boolean isoMorphicStrings(String s, String t) {
		HashMap<Character, Character> hs = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hs.containsKey(s.charAt(i))) {
				if (hs.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			}
			else if (hs.containsValue(t.charAt(i))) {
				return false;
			}
			else {
				hs.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}
}