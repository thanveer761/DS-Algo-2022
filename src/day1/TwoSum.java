package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	/*
	 * 1) Did I understand the problem? Yes 
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?
	 *    What is the expected output?
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    How big is your test data set will be?
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 *  
	 * 5) Do I know alternate solutions as well? No
	 * 
	 * 		No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * 		Then, explain either both or the best (depends on the time)
	 * 
	 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * 		Approach 2: Write down the options and benefits and code the best 
	 * 
	 * 7) Start always with Psuedo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set 
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */


	@Test
	public void testCase1() {
		int[] input = { 2,7,11,15};
		int target = 9;
		int[] twoSum = twoSum(input, target);
		System.out.println(Arrays.toString(twoSum));
	//	Assert.assertArrayEquals(twoSum(input, target), new int[] { 0, 3 });

	}

	@Test
	public void testCase2() {
		int[] input = { 2, 4, 6, 8, 12, 5 };
		int target = 14;
		Assert.assertArrayEquals(twoSum(input, target), new int[] { 0, 3});
	}



	@Test
	public void testCase3() {
		int[] input = {};
		int target = 10;
		Assert.assertArrayEquals(twoSum(input, target), new int[] {});
	}
	/*
	 * 
	 * use 2 for loops  by iterating
	 * compare the added elem with target 
	 * if matches return its index 
	 * else throw an exception or -1,-1
	 * or the nums of array is less than 2 return empty array
	 * 
	 */

	//bruteForce o[n^2]
	/*private int[] twoSum(int[] nums, int target) {
		if(nums.length<=2) {
			return new int[]{};
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				if(nums[i]+nums[j]==target) {
				return new int[] {i,j};	
			}
		}
		}
		return new int[] {-1,-1};
}*/
	public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> hm = new HashMap<>();
	        for(int i = 0; i < nums.length;i++) {
	            if(hm.containsKey(target - nums[i])) {
	                return new int[] {hm.get(target - nums[i]), i};
	            } else {
	                hm.put(nums[i], i);
	            }
	        }
	        return null;
		
	}}