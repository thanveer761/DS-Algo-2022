package sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSort {

	@Test
	public void test1() {
		int[] data = {4,0,2,5,1,-8,7,-6};
		int[] op = inSort(data);
		System.out.println(Arrays.toString(op));
	//	Assert.assertArrayEquals(Sorting(data), new int[] {-4,-2,0,8,11,12,13});
	}

	@Test
	public void test2() {
		int[] data = {4,3,2,1};
		Assert.assertArrayEquals(inSort(data), new int[] {1,2,3,4});
	}
	public int[] inSort(int[] num) {
		 int n = num.length;
	        for (int i = 0; i < n; i++) {
	            int p = num[i];
	            int j = i - 1;
	            while (j >= 0 && num[j] > p) {
	            	num[j + 1] = num[j];
	                j = j - 1;
	            }
	            num[j + 1] = p;
	        }
	        return num;

	}
}
