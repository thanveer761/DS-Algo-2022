package day3;


import org.junit.Test;

public class MinSizeSubArray {
	@Test
	public void testCase1() {
		int[] input = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		int prac = prac(input, target);
		System.out.println(prac);
	}

	public int prac(int[] nums, int target) {

		int start = 0,  end = 0,  sum = 0,  minLength = Integer.MAX_VALUE;
		  
		  while (end < nums.length) {
		    // keep a running sum as the end pointer expands your window
		    sum += nums[end++];
			
		    // this while loop will be skipped until your window meets the condition that 
			// the running sum is equal or greater than the int 's' passed in. aka the window
			// is valid
		    while (sum >= target) {
			// now you want to condense your window to find the minimum window as the 
			// problem wants
			
			  // updates the min length
		      minLength = Math.min(minLength, end - start);
			  
			  // this moves your start index by one condensing your window and 
			  // decreasing the sum to make sure that it's still valid
		      sum -= nums[start++];
		    }
		  }
		  
		  // if no min is found, return 0 or else return the min length you found above. 
		  return minLength == Integer.MAX_VALUE ? 0 : minLength;
		}}