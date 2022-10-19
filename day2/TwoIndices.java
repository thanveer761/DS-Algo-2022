package day2;

import org.junit.Assert;
import org.junit.Test;

public class TwoIndices {
	/*
	 * 1) Did I understand the problem? Yes 
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?-->int []
	 *    What is the expected output?-->boolean
	 *    Do I have constraints to solve the problem?No
	 *    Do I have all informations to go to next step!!yes
	 *    How big is your test data set will be? 3 
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
		int[] nums= {10,2,5,3};
		
		Assert.assertEquals(twoIndices(nums), true);
	}
	@Test
	public void testCase2() {
		int[] nums= {3,1,7,11};
		Assert.assertEquals(twoIndices(nums), false);
	}
	
	/*initialize an index variable
	 * traverse through the nested array
	 * if nums[i] * nums[j]!=nums[i]
	 * increment index and return false,else return true;
	 *
	 */
	public  boolean twoIndices(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == 2 * nums[j] && i != j) {
					return true;
				}
			}}
		return false;

	}
}
