package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MaxDiff {
	@Test
	public void test1() {

		int[] prices = {7,1,2,5 };
		int op = maxDiff(prices);
		System.out.println(op);
	}
	@Test
	public void test2() {

		int[] prices = { 7, 5, 4, 3 };
		int op = maxDiff(prices);
		System.out.println(op);
	}
	@Test
	public void test3() {

		int[] prices = { 3,4,5,7};
		int op = maxDiff(prices);
		System.out.println(op);
	}
	public int maxDiff(int[] prices) {
		int  min= prices[0];
		int neg = -1;
		for (int i = 1; i <prices.length; i++) {
			if (prices[i]> min)
				neg = Math.max(prices[i] - min, neg);
			min = Math.min(min, prices[i]);
		}
		return neg;

	}

}
