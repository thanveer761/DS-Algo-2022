package day7;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DuplicateMajoElem {

	@Test
	public void td1() {
		int[] nums = {3,2,3};
		int prac = prac(nums);
		System.out.println(prac);
	}

	public int prac(int[] nums) {
	/*	 Arrays.sort(nums);
		 int n = nums.length;
		 return nums[(n-1)/2];
		*/
		Map<Integer, Integer> mn = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			mn.put(nums[i], mn.getOrDefault(nums[i], 0) + 1);
		}
		Set<Entry<Integer, Integer>> entrySet = mn.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if ((nums.length / 2) < entry.getValue())
				return entry.getKey();
		}
		return -1;
	}
	}

