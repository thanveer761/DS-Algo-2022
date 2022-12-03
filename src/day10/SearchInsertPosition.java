package day10;

import org.junit.Test;

public class SearchInsertPosition {
	@Test
	public void testCase1() {
		int[] nums= {1,3,5,6};
		int target=5;
		int returnIndex = searchInsertPosition(nums, target);
		System.out.println(returnIndex);
	}
	@Test
	public void testCase2() {
		int[] nums= {1,3,5,6};
		int target=2;
		int returnIndex = searchInsertPosition(nums, target);
		System.out.println(returnIndex);
	}
	@Test
	public void testCase3() {
		int[] nums= {1,3,5,6};
		int target=7;
		int returnIndex = searchInsertPosition(nums, target);
		System.out.println(returnIndex);
	}
	public int searchInsertPosition(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] < target) left = mid+1;
			else right = mid -1;
		}
		return left;
		
	}
}
