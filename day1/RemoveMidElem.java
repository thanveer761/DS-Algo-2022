package day1;

import java.util.Arrays;

public class RemoveMidElem {
	
	/*Pseudocode:
	 * create a new int array of nums length 
	 * divide the Length of array by 2 and store them in a index variable
	 * traverse through each index and check if i is not equal to index
	 * if it is equal increment j
	 * if not equal store them in length[j]
	 * finally return the length.
	 */
	public static void main(String[] args) {
		int [] nums= {1,2,3,4};
int[] length = new int[nums.length-1];
int ind=(nums.length-1)/2;
for (int i = 0,j=0; i < nums.length; i++) {
	if(i!=ind) {
		length[j]=nums[i];
		j++;
	}
	
}
System.out.println(Arrays.toString(length));
	}

}
