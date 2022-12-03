package day1;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElem {

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
		int[] input = { 3, 2, 2, 3 };
		int Val = 3;

		Assert.assertEquals(removeElem(input, Val), 2);
	}

	@Test
	public void testCase2() {
		int[] input = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int Val = 2;
		Assert.assertEquals(removeElem(input, Val), 5);
	}

	@Test
	public void testCase3() {
		int[] input = {};
		int Val = 2;
		Assert.assertEquals(removeElem(input, Val), 0);
	}
	/*
	 * Pseudocode: create a int var as 0 traverse through nums array by using for
	 * loop check if nums is not equal to Value store them in int var and increment
	 * it finally return the array
	 * 
	 */

	// bruteForce o[n]
	private int removeElem(int[] nums, int Val) {

		int arr = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != Val) {
				nums[arr++] = nums[i];
			}
		}

		return arr;

	}
}
