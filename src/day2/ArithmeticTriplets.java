package day2;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTriplets {
	@Test
	public void testCase1() {
		int[] nums= {0,1,4,6,7,10};
		int diff=3;

		Assert.assertEquals(arithmeticTriplets(nums, diff),2);
	}

	/*	private int arithmeticTriplets(int[] nums, int diff) {
		   int count=0;
		      for(int i=0;i<nums.length;i++){
		          for(int j=i+1;j<nums.length;j++){
		               for(int k=j+1;k<nums.length;k++){
		                   if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff) count++;
		                 }
		          }
		   }
		  return count;*/
	private int arithmeticTriplets(int[] nums, int diff) {
		
		 HashSet<Integer> hs=new HashSet<>();
		int n = nums.length;
		int count=0;
		int left=0, right=1;
		while(right<n) {
			hs.add(nums[left]);
			if(nums[right]-nums[left]==diff) {
				if(hs.contains(nums[left]-diff))
				count++;
				right++;
			}
			else if (nums[right]-nums[left]>diff) {
				left++;
			} 
			else {
				right++;
				

			}

		}
		return count;

	}
}
