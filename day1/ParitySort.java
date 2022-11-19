package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ParitySort {

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
public void testCase3() {
	int[] input = {};
	Assert.assertArrayEquals(paritySort(input), new int[] {-1});
}
	/*
	 * Pseudocode:
	 * create an empty array of nums size 
	 * traverse through nums array
	 *  check if nums is divisble by 2
	 *  store them in array and increment the index
	 *  and, again compare the nums is not divisble by 1
	 *  store them in same  array and increment the index
	 * finally return the array
	 * 
	 */

	//bruteForce o[n^2]
	/*private int[] paritySort(int[] nums) {
		if(nums.length<1) {
			return new int[] {-1};
		}
		int index=0;
		int arr[]= new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
      arr[index++]=nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2!=0) {
			      arr[index++]=nums[i];
						}
		}
		return arr;

	}*/
/*
 * Pseudocode:
 * 
 * 
 */
//Two Pointers
private int[] paritySort(int[] nums) {
	if(nums.length<1) {
		return new int[] {-1};
	}
	int left =0, right=nums.length-1;
	while(left<right) {
		if(nums[left]%2==0) {
			left++;
		}else if(nums[right]%2!=0) {
			right--;
		}else {
			int temp = nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
		}
	}
	
	return nums;
}}
