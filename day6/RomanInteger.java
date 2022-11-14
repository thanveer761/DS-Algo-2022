package day6;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class RomanInteger {
	@Test
	public void testCase1() {
		String s = "III";
		int romanInt = romanToInt(s);
		Assert.assertEquals(romanInt, 3);
	}

	@Test
	public void testCase2() {
		String s = "LVIII";
		int romanInt = romanToInt(s);
		Assert.assertEquals(romanInt, 58);
	}

	@Test
	public void testCase3() {
		String s = "MCMXCIV";
		int romanInt = romanToInt(s);
		Assert.assertEquals(romanInt, 1994);
	}

	public int romanToInt(String s) {
		int preVal = 0, res = 0;
		int currVal;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);

		for (int i = 0; i < s.length(); i++) {
			currVal = map.get(s.charAt(i));
			if (preVal < currVal) {
				res -= preVal * 2;
			}
			preVal = currVal;
			res += currVal;
		}
		return res;

	}
}