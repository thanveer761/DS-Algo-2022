package day10;

import org.junit.Test;

public class KthMissingPositiveNum {
	@Test
	public void testCase1() {
		int[] arr= {2,3,4,7,11};
		int k=5;
		int kthMissingPositive = kthMissingPositive(arr, k);
		System.out.println(kthMissingPositive);
	}
	@Test
	public void testCase2() {
		int[] arr= {1,2,3,4};
		int k=2;
		int kthMissingPositive = kthMissingPositive(arr, k);
		System.out.println(kthMissingPositive);
	}
	public int kthMissingPositive(int[] arr, int k) {
		int[] op= new int[k];
		int st=0;
		int ind=0;
		for (int i = 1; i <1000; i++) {
			if(st<i) {
				
			}
			if(arr[st++]!=i) {
				ind=ind+1;
			}
			i++;
			if(ind==k) return op[k-1];
		}
		return ind;
	}
}
