package day3;

import org.junit.Assert;
import org.junit.Test;

public class ReturnSumofK {
	/*
	 * 1) Did I understand the problem? Yes -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? No
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
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
		int[] input = { 1, 5, 2, 3, 7, 1 };
		int k = 3;
		Assert.assertEquals(returnSumofK(input, k), 12);
	}

	@Test
	public void testCase2() {
		int[] input = { 1, 1, 1, 1 };
		int k = 3;
		Assert.assertEquals(returnSumofK(input, k), 3);
	}

	@Test
	public void testCase3() {
		int[] input = {};
		int k = 3;
		Assert.assertEquals(returnSumofK(input, k), 0);
	}

	/*
	 * 
	 * use 2 for loops by iterating compare the added elem with target if matches
	 * return its index else throw an exception or -1,-1 or the nums of array is
	 * less than 2 return empty array
	 * 
	 */
//BruteForce
	private int returnSumofK(int[] nums, int k) {
	
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k1 = j+1; k1 < nums.length; k1++) {
					
					int max=nums[i]+nums[j]+nums[k1];
					System.out.println(max);
				}
				}
				
			}
		
		return k;
		
	}

	/*
	 * // 2 pointers o[n^2] private int returnSumofK(int[] nums, int k) { int maxSum
	 * = Integer.MIN_VALUE; int currentSum = 0; for(int i=0; i<k; i++) { currentSum
	 * +=nums[i]; } maxSum = Math.max(maxSum, currentSum); for (int i = 1; i <
	 * nums.length-k; i++) { currentSum +=nums[i+k-1]-nums[i-1]; maxSum =
	 * Math.max(maxSum, currentSum); } return maxSum; }
	 */
}
