package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindContentChildren {
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
		int[] g= {10,2,5,3};
		int[] s= {1,2};
		int op = findContentChild(g, s);
		Assert.assertEquals(1, op);
	}
	@Test
	public void testCase2() {
		int[] g= {1,2};
		int[] s= {1,2,3};
		int op = findContentChild(g, s);
		Assert.assertEquals(2, op);
	}

	public int findContentChild(int[] g, int[] s) {
		Arrays.sort(g);
        Arrays.sort(s);
     int i = 0;
for(int j=0;i<g.length && j<s.length;j++) {
	if(g[i]<=s[j]) 
		i++;
}
return i;
   }
}