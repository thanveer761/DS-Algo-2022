package day3;

import org.junit.Assert;
import org.junit.Test;

public class MaxAverage {
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
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double maxAvege = maxAverage(nums, k);
		System.out.println(maxAvege);
	}
	@Test
	public void testCase2() {
		int[] nums = {5};
		int k = 1;
		double maxAvege = maxAverage(nums, k);
		System.out.println(maxAvege);
	}
	/*
	 * create a int index variable =0; traverse till k and store the sum assign with
	 * anothere variable named as output again, traverse till length and, increment
	 * the sume with formula(j+k-1) finally find max
	 * 
	 */

	// 2 pointers o[n^2]
	private double maxAverage(int[] nums, int k) {
		double max = 0;
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];

		}
		double output = sum / k;

		for (int i = 1; i < nums.length - k; i++) {
			sum += nums[i+k-1] - nums[i - 1];
			max = Math.max(output, sum / k);
		}
		return max;
	}

}
