package day6;

import org.junit.Assert;
import org.junit.Test;



public class TownJudge {

	@Test
	public void testCase1() {
	int	n = 2;
	int[][] trust = {{1,2}};
	int findJudge = findJudge(n, trust);
	Assert.assertEquals(findJudge, 2);
	}
	@Test
	public void testCase2() {
	int	n = 3;
	int[][] trust = {{1,3},{2,3}};
	int findJudge = findJudge(n, trust);
	Assert.assertEquals(findJudge, 3);
	}
	@Test
	public void testCase3() {
	int	n = 3;
	int[][] trust = {{1,3},{2,3},{3,1}};
	int findJudge = findJudge(n, trust);
	Assert.assertEquals(findJudge, -1);
	}
		public int findJudge(int n, int[][] trust) {
	        if(trust.length == 0) return n == 1 ? 1 : -1;
	        int[] trustCount = new int[n+1];
	        for(int[] t : trust){
	            trustCount[t[1]]++;
	            trustCount[t[0]]--;
	        }
	        for(int i = 1; i < trustCount.length;i++){
	            if(trustCount[i] == n-1)
	                return i;
	        }
	        return -1;

	}
}
