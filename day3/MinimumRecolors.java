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
		int k = 2;
		Assert.assertEquals(minRecolors(s, k), 0);

	}
	/*pseudocode:
	 * 
	 * 
	 */

	public int minRecolors(String s, int k) {
		int count = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == 'W')
				count++;

		}
		min = count;
		for (int i = 1, j = k; j < s.length();i++, j++) {
			if (s.charAt(i - 1) == 'W' && s.charAt(j) == 'B')
				count--;

			if (s.charAt(i - 1) == 'B' && s.charAt(j) == 'W')
				count++;

			min = Math.min(min, count);

		}

		return min;

	}
}
