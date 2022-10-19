package day2;

import org.junit.Assert;
import org.junit.Test;

public class MergeStrings {
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
		String word1="abc", word2="pqr";
		Assert.assertEquals(mergeString(word1, word2),"apbqcr");
	}

	@Test
	public void testCase2() {
		String word1="ab", word2="pqrs";
		Assert.assertEquals(mergeString(word1, word2),"apbqrs");
	}
	
	
	/*pseudocode:
	 * declare an empty string variable
	 * intialze 2 variables as 0
	 * iterate throught word1 & word2
	 * if i is less than word1lenth & word2lenth append each character
	 * reurn op
	 * 
	 */
	//bruteForce--> TC:-O[N];	sc:-O[1]
	public String mergeString(String word1,String word2) {
		 String  op ="";
	        int a =0,b=0;
	        for(int i=0;i<word1.length()+word2.length();i++){       
	            if(i<word1.length()){
	                op+=word1.charAt(a);
	                a++;
	            }
	            if(i<word2.length()){
	                op +=word2.charAt(b);
	                b++;
	            }
	        }   
	    return op;
	    
}}
