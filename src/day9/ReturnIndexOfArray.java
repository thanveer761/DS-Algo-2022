package day9;


import org.junit.Test;

public class ReturnIndexOfArray {
	
	@Test
	public void testCase1() {
		int[] nums= {-1,0,2,5,9,8};
		int target=9;
		int returnIndex = returnIndex(nums, target);
		System.out.println(returnIndex);
	}
	@Test
	public void testCase2() {
		int[] nums= {-1,0,2,5,9,9,8};
		int target=9;
		int returnIndex = returnIndex(nums, target);
		System.out.println(returnIndex);
	}
	/*
	 * pseudocode:
	 * traverse through the array
	 * if the nums[i] matches its return its index 
	 * else return -1
	 */
	
	public int returnIndex(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] < target) left = mid+1;
			else right = mid -1;
		}
		return -1;
		
	}
	/*public int returnIndex(int[] nums, int target) {
	
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;

	}
	*/

}
