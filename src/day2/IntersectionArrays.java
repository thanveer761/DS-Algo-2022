package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionArrays {
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
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		Assert.assertArrayEquals(arrIntersection(nums1,nums2), new int[] {2,2});
	}

	@Test
	public void testCase2() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		Assert.assertArrayEquals(arrIntersection(nums1,nums2), new int[] {4,9});
	}

	private int[] arrIntersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] interSection = new int[Math.min(nums1.length, nums2.length)];
		int left = 0, right = 0, counter = 0;
		while(right < nums2.length && left < nums1.length) {

			if(nums1[left] < nums2[right]) {
				left++;
			}else if(nums1[left] == nums2[right]) {
				interSection[counter++] = nums1[left++];
				right++;
			}
			else right++;

		}
		int[] newArray = Arrays.copyOf(interSection, counter);
		System.out.println(Arrays.toString(newArray));
		return newArray;

	}
}
