package day7;

import java.util.Arrays;

import org.junit.Test;

public class SpotProb {
	@Test
	public void td1() {
		int[] nums= {3,2,1};
		int spot = spot(nums);
		System.out.println(spot);
	}
	@Test
	public void td2() {
		int[] nums= {1,2};
		int spot = spot(nums);
		System.out.println(spot);
	}

	public int spot(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j])
				nums[j++] = nums[i];
		}

		if(i >= 2) return nums[i - 2];
		else return nums[i];	

	}
}
