package day1;

import org.junit.Assert;
import org.junit.Test;

public class Assessment_SumOfTwoNumbers {

	    @Test
	    public void td1(){
	        Assert.assertArrayEquals(getNoZeroIntegers(2), new int[]{1,1});
	    }

	    @Test
	    public void td2(){
	        Assert.assertArrayEquals(getNoZeroIntegers(11), new int[]{2,9});
	    }


	    @Test
	    public void td3(){
	        Assert.assertArrayEquals(getNoZeroIntegers(1102), new int[]{111,991});
	    }    

	  /*  Pseudocode
	    1. loop i from 1 to n/2, consider i and n-1-i ( consider array of 1 to n values, finding values of left and right)
	    2. check both i and n-1-i doesn't have any zeros, if so return the value
	    Time Complexity - O[N/2]
	    Space Complexity - O[1]
	     */
	    
	    private boolean isNoZero(int n){
	        while (n>0){
	            if (n%10 == 0)
	                return false;
	            n /= 10;
	        }
	        return true;
	    }

	    public int[] getNoZeroIntegers(int n) {
	        for (int i=1; i<=n/2; i++)
	            if (isNoZero(i) && isNoZero(n-i))
	                return new int[]{i,n-i};

	        return null;
	    }

	}
