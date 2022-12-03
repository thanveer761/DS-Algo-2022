package day2;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTwoPointers {
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
		int[] input = { 2, 4, 6, 8, 12, 5 };
		Assert.assertArrayEquals(twoSum(input), new int[] {5,12,8,6,4,2});
	}

	@Test
	public void testCase2() {
		int[] input = {1};
		Assert.assertArrayEquals(twoSum(input), new int[] {1});
	}



	@Test
	public void testCase3() {
		int[] input = {1,1,1,1};
		Assert.assertArrayEquals(twoSum(input), new int[] {1,1,1,1});
	}

	/*
	 * 2 pointers:
	 * declare left from 0 and right from last inded
	 * traverse through the array
	 * declare an temp variable 
	 * nums[left]!=nums[right]
	 * 
	 */

	//2 pointers o[n^2]
	private int[] twoSum(int[] nums) {
		int left=0, right=nums.length-1;
		while(left<right) {
			int temp =nums[left];
			nums[left++]=nums[right];
			nums[right--]=temp;

		}
		
		return nums;

	}
}
