package day4;

public class AssessMent1 {
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
		private int[] twoSum(int[] nums, int target) {
			
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					if(nums[i]+nums[j]==target) {
					return new int[] {i+1,j+1};	
				}
			}
			}
			return new int[] {-1,-1};
	}
		
	}
