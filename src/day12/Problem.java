package day12;


import org.junit.Test;
public class Problem {
	@Test
	public void td1() {
		int N = 7;
		int solution = Solution(N);
		System.out.println(solution);
	}

	@Test
	public void td2() {
		int N = 5;
		int solution = Solution(N);
		System.out.println(solution);
		
	}

	public int Solution(int N) {
		int[] op=new int[N];
		int count=0;
		int sum=0;
		int sec=0;
	for (int i = 1; i <=N; i++) {
		op[count++]=i;
	}
		for (int i = 0; i < op.length; i+=2) {
			sum+=op[i];
		}
		for (int i = 1; i <op.length; i+=4) {
			sec+=op[i];
		}
		return sec+sum;
	}
	
	
}
