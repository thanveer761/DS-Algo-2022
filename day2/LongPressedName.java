package day2;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName {
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
	public void testCase0() {
		String name = "alex", typed = "aaleex";
		Assert.assertEquals(longPressedName(name, typed), true);
	}

	@Test
	public void testCase1() {
		String name = "khan", typed = "khaan";
		Assert.assertEquals(longPressedName(name, typed), true);
	}

	@Test
	public void testCase2() {
		String name = "saeed", typed = "ssaaedd";
		Assert.assertEquals(longPressedName(name, typed), false);
	}

	@Test
	public void testCase3() {
		String name = "thanveer", typed = "ahmed";
		Assert.assertEquals(longPressedName(name, typed), false);
	}

	/*
	 * pseudocode: initialize i & j variables as 0 if name.length equal to type
	 * length return true if name.length greater than type length return true if
	 * name.charArt[i] matches with typed.charAt[j] increment i&j if typed.charAt[0]
	 * is not eqauls to typed.charAt[1st] index return false; if i == name.lenght
	 * return true
	 */
	// bruteForce--> TC:-O[N]; sc:-O[1]
	public boolean longPressedName(String name, String typed) {

		int i = 0, j = 0;

		if (name.length() == typed.length())
			return name.equals(typed);

		if (name.length() > typed.length())
			return false;

		while (j < typed.length()) {
			if (i < name.length() && name.charAt(i) == typed.charAt(j)) {

				i++;

			} else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
				return false;
			}
			j++;
		}

		return i == name.length();

	}
}