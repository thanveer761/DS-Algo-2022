package day3;

import java.util.Arrays;

import org.junit.Test;

public class MinDiffBetweenKScores {

	@Test
	public void td1(){
		int[] nums = {90};
		int k=1;
		int minDiff = minDiff(nums, k);
		System.out.println(minDiff);
	}
	@Test
	public void td2(){
		int[] nums = {9,4,1,7};
		int k=2;
		int minDiff = minDiff(nums, k);
		System.out.println(minDiff);
	}

	public int minDiff(int[] nums, int k){

		int min = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i< nums.length; i++) {
			if(i>=k-1){
	               min=Math.min(min,nums[i]-nums[i-(k-1)]); 
	            }
		}

		return min;




	}
}
