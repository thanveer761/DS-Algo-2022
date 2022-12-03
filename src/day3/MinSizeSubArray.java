package day3;


import org.junit.Test;

public class MinSizeSubArray {
	@Test
	public void testCase1() {
		int[] input = { 2, 3, 1, 2, 4, 3 };
		int tar = 7;
		int prac = prac(input, tar);
		System.out.println(prac);
	}

	public int prac(int[] nums, int tar) {

		int left = 0, right = 0, sum = 0;
		int min = Integer.MAX_VALUE;
		while (right < nums.length) {
			sum += nums[right];
			if (sum >= tar) {
				while (sum >= tar) {
					sum -= nums[left++];
					
				}
				min = Math.min(tar, right - left + 2);
			}
			right++;
		}
		return min;

	}

}
