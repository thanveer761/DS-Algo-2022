package day2;

import org.junit.Assert;
import org.junit.Test;


public class ClosestOccuranceOfCharacter {
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
		String s="aaab", c="b";
		Assert.assertArrayEquals(closestOccu(s,c),new int[] {3,2,1,0});
	}
	@Test
	public void testCase2() {
		String s="looveleetcode", c="e";
		Assert.assertArrayEquals(closestOccu(s,c),new int[] {3,2,1,0,1,0,0,1,2,2,1,0});
	}


	/*pseudocode:
	 * crreate a new array length for string s 
	 * traverse through the loop
	 * declare a substring from 0 to start index
	 * declare another substring for s
	 * declare a last of index of c string as left
	 * get the whole index substring2
	 * if left >-1 && right >-1
	 * 
	 * 
	 * 
	 */
	//bruteForce
	public int[] closestOccu(String s,String c) {
		int[] result = new int[s.length()];
		for (int i = 0; i < result.length; i++) {
			String substring = s.substring(0, i);
			String substring2 = s.substring(i);
			int left = substring.lastIndexOf(c);
			int right = substring2.indexOf(c);

			if (left > -1 && right > -1)
				result[i] = Math.min(i - left, right);
			else if (left > -1)
				result[i] = i - left;
			else
				result[i] = right;
		}

		return result;

	}
	
}
