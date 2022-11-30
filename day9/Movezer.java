package day9;

import java.util.Arrays;

public class Movezer {

	public static void main(String[] args) {
		
	int[] nums= {0,1,0,3,12};
	int left=0,right=0;
	while(right<nums.length) {
		if(nums[right]!=0) {
		int temp=nums[right];
		nums[right]=nums[left];
		nums[left++]=temp;
		}
		right++;
	}
	System.out.println(Arrays.toString(nums));

	}

}
