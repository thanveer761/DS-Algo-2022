package day3;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolors {
	@Test
	public void testCase1() {
		String s = "WBBWWBBWBW";
		int k = 7;
		Assert.assertEquals(minRecolors(s, k), 3);
	}

	@Test
	public void testCase2() {
		String s = "WBWBBBW";
		int k = 7;
		Assert.assertEquals(minRecolors(s, k), 0);

	}

	public int minRecolors(String s, int k) {
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == 'W') {
				count++;
			}
			int op = count;
			

		}

		return count;

	}
}
