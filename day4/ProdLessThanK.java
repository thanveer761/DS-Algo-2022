package day4;

import org.junit.Assert;
import org.junit.Test;



public class ProdLessThanK {
	@Test
	public void testCase1() {
		int[] nums = {10,5,2,6};
		int k = 100;
		int op = prodLessThanK(nums, k);
		Assert.assertEquals(8, op);;
	}
	@Test
	public void testCase2() {
		int[] nums = {1,2,3};
		int k = 0;
		int op = prodLessThanK(nums, k);
		Assert.assertEquals(0, op);;
	}
	
	public int prodLessThanK(int[] nums, int k) {
		if(k<=1) return 0;
		int left =0, right=0,count=0;
		int prod=1;
		while(right<nums.length) {
			prod*=nums[right];
			while(prod>=k) 
				prod/=nums[left++];
				count+=1+(right-left);
				right++;
			
		
		
		}
		return count;
		
		
		
		
		/*int count=0;
		for (int i = 0; i < nums.length; i++) {
			int prod=1;
			for (int j = i; j < nums.length; j++) {
				prod*=nums[j];
				if(prod<k) count++;
				else break;
				}
			}
		return count;
		
*/
	}
}