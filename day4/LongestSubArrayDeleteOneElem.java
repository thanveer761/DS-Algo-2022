package day4;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubArrayDeleteOneElem {
	@Test
	public void testCase1() {
		int[] input = { 1,1,0,1 };
		Assert.assertEquals(longestSubArrayDeleteOneElem(input), 3);
	}
	@Test
	public void testCase2() {
		int[] input = {0,1,1,1,0,1,1,0,1};
		Assert.assertEquals(longestSubArrayDeleteOneElem(input), 5);
	}
	
	public int longestSubArrayDeleteOneElem(int[] nums) {
		
		 int prevCnt = 0, cnt = 0, res = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 1) cnt++;
	            else {
	                res = Math.max(res, cnt + prevCnt);
	                prevCnt = cnt;
	                cnt = 0;
	            }
	        }
	        res = Math.max(res, cnt + prevCnt);
	        return res == nums.length ? res - 1 : res;  //if all ones, must remove one;
	    }
	
}
