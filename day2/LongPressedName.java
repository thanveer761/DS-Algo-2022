package day2;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName {
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
	public void testCase0() {
		String name="alex", typed="aaleex";
		Assert.assertEquals(longPressedName(name,typed), true);
	}
	@Test
	public void testCase1() {
		String name="khan", typed="khaan";
		Assert.assertEquals(longPressedName(name,typed), true);
	}

	@Test
	public void testCase2() {
		String name="saeed", typed="ssaaedd";
		Assert.assertEquals(longPressedName(name,typed), false);
	}

	@Test
	public void testCase3() {
		String name="thanveer", typed="ahmed";
		Assert.assertEquals(longPressedName(name,typed), false);
	}

	/*pseudocode:
	 *traverse through name and typed string
	 *if name and typed contains more than on character if name string
	 *return true 
	 *else return false
	 * 
	 */
	//bruteForce--> TC:-O[N];	sc:-O[1]
	public boolean longPressedName(String name,String typed) {
		int origName = name.length();
		int typedName = typed.length();
		for (int i = 0; i < origName; i++) {
			for (int j = 0; j < typedName; j++) {
				if(name.charAt(i)!=typed.charAt(i)) {
					return true;
				}else 
					return false;
			}
			}
			return false;
		
		}}
