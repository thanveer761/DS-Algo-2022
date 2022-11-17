package day2;

import org.junit.Test;

public class CheckN {

	@Test
	public void td1() {
		int[]  nums = {10,2,5,3};
		boolean op = checkN(nums);
		System.out.println(op);

	}
	@Test
	public void td2() {
		

	}
	
	public boolean checkN(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length; j++) {
			if(nums[i]==2*nums[j]) {
				return true;
			}
		}}
		
		
		
		return false;
		

	}

}
