package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

public class MergedSortedArray {

	@Test
	public void example1() {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		Assert.assertArrayEquals(mergeSortedArray(nums1, m, nums2, n), new int[] { 1, 2, 2, 3, 5, 6 });

	}

	public int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

		int start = 0;
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[start++];
		}

		Arrays.sort(nums1);
		return nums1;

	}

}