package day5;



import org.junit.Assert;
import org.junit.Test;

public class MajorityElem {
	@Test
	public void testCase1() {
		int[] nums = { 3, 2, 3 };
		Assert.assertEquals(majorityElem(nums), 3);
	}

	@Test
	public void testCase2() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		Assert.assertEquals(majorityElem(nums), 2);
	}
	// Brute Force Method
	// Time Complexity :- O(N^2)
	// Space Complexity :- O(1)

	public int majorityElem(int[] nums) {
		if (nums.length == 1)
			return 1;
		int cnt = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			cnt = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					cnt++;
			}

			if (cnt >= nums.length / 2)
				return nums[i];
		}
		return 0;
	}
} // Using Hash Map
// Time Complexity :- O(nlogn)
// Space Complexity :- O(1)
/*
 * public int majorityElem(int[] nums) { if (nums.length == 1) return 1;
 * HashMap<Integer, Integer> hm = new HashMap<>(); for (int i = 0; i <
 * nums.length; i++) { if (!hm.containsKey(nums[i])) { hm.put(nums[i], 1); }
 * else { hm.put(nums[i], hm.get(nums[i]) + 1); } System.out.println(nums[i] +
 * "  " + hm.get(nums[i])); if (hm.get(nums[i]) > nums.length / 2) return
 * nums[i]; } return 0;
 * 
 * } }
 */
