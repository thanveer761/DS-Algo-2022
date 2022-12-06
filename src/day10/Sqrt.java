package day10;

import org.junit.Test;

public class Sqrt {
	@Test
	public void testCase1() {
		int x=36;
		int sqrt = sqrt(x);
		System.out.println(sqrt);
	}
	@Test
	public void testCase2() {
		int x =8;
		int sqrt = sqrt(x);
		System.out.println(sqrt);
	}
	
	public int sqrt(int x) {
		int low=1;
		int high=x;
		while(low<=high) {
		int mid=(high+low)/2;
		int r=x/mid;
		if(r==mid) return mid;
		else if (r < mid) {
            high = mid-1;
        }
        else {
            low = mid+1;
        }
    }
    return high; 
		}

	}
