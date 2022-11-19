package day1;

import org.junit.Assert;
import org.junit.Test;

public class MissinElem {
	@Test
	public void testCase1() {
		int[] nums = {3,0,1};
		int op = missinElem(nums);
Assert.assertEquals(op,2);
	}

@Test
	public void testCase2() {
		int[] nums = {0,1};
		int op = missinElem(nums);
		Assert.assertEquals(op,2);
	}

private int missinElem(int[] nums) {
	 int sum=0;
     int n = nums.length;
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
     }
     return n*(n+1)/2 - sum ; //sum of n natural numbers = n*(n+1)/2
 
}
}
