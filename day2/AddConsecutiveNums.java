package day2;

import java.util.Arrays;

public class AddConsecutiveNums {

	public static void main(String[] args) {
		int ind=0;
		int[] nums= {1,2,3,4,5};
		int [] arr = new int[nums.length-1];
				for (int i = 0; i < nums.length-1; i++) {
					arr[ind++] = nums[i] +nums[i+1] ;  
					
				} 
System.out.println(Arrays.toString(arr));
	}

}
