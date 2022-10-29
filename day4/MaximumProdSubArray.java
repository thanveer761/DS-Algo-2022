package day4;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProdSubArray {
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
		int[] input = { 2, 3, -2, 4 };
		Assert.assertEquals(maximumProdSubArray(input), 6);
	}

	@Test
	public void testCase2() {
		int[] input = { -2, 0, -1 };

		Assert.assertEquals(maximumProdSubArray(input), 0);
	}
//TC:0[N^2] SC:O[1]--->BruteForce
	/*public int maximumProdSubArray(int[] input) {

int count=0,temp=1;
		for (int i = 0; i < input.length; i++) {
			temp=1;
			for (int j = i; j < input.length; j++) {
				temp=temp*input[j];
				count=Math.max(count, temp);
			}
		}
		
		return count;
	}*/
	
	public int maximumProdSubArray(int[] input) {
		int min = Integer.MAX_VALUE;
	
		int left=0,right=1,count=0;
		while(left<=right) {
			count=input[left]*input[right];
			left++;
			right++;
			count=Math.max(min,count);
			if(right>input.length-1) break;
		}
		return count;
		
	}

}
