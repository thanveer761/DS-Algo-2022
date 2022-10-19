package day2;

import java.util.Arrays;

public class Add3ConsecutiveNums {

	public static void main(String[] args) {
		int ind=0;
		int[] nums= {1,2,3,4,5};
		int [] arr = new int[nums.length];
				for (int i = 0; i < nums.length; i++) {
					for (int j = i; j < nums.length; j++) {
						arr[ind++] = nums[j];  
						
					}
					
					
				} 
System.out.println(Arrays.toString(arr));
	}

}
