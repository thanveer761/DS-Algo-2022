package anagramAndFibonicci;

import org.junit.Test;

public class Fibonaccii {
	@Test
	public void testCase1() {
		int n=3;
		int recursion = recursion(n);
		System.out.println(recursion);
	}
	
	@Test
	public void testCase2() {
		int n =8;
		int recursion = recursion(n);
		System.out.println(recursion);
	}
	/*public int fibonnacci(int n) {
		int fwd=0;
		int bwd=1;
		for (int i = 0; i < n; i++) {
			int temp=fwd+bwd;
			fwd=bwd;
			bwd=temp;
		}
		return fwd;
	}*/
	public int recursion(int n) {
		if(n==0) return 0;
		if(n==1||n==2) return 1;
		int res=recursion(n-1)+recursion(n-2);
		
		return res;
		

	}
}
