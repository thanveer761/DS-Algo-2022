package day4;

import java.util.Arrays;

import org.junit.Test;

public class SortNumsUsingDutchFlag {
	@Test
	public void testCase1() {
		int[] nums= {0,2,8,0,6,5};
		int[] sortNumsUsinFlag = sortNumsUsingDutchFlag(nums);
		System.out.println(Arrays.toString(sortNumsUsinFlag));
	}


	public int[] sortNumsUsingDutchFlag(int[] nums) {
		int low=0,mid=0,high=nums.length-1;
		while(mid<=high) {
			if(nums[mid]==0) {
				int temp=nums[mid];
				nums[mid++]=nums[low];
				nums[low++]=temp;
			}else if(nums[mid]==1) {
				mid++;
			}else if(nums[mid]==2) {

				int temp=nums[mid];
				nums[mid]=nums[high];
				nums[high--]=temp;
			}

		}

		return nums;

	}
}
