package day5;

import java.util.Arrays;


import org.junit.Test;

public class DupZero {
	@Test
	public void testCase1() {
		int [] arr= {1,0,2,3,0,4,5,0};
		int[] op = duplicateZeros(arr);
		System.out.println(Arrays.toString(op));
	}
	
	
	
	
	@Test
	public void testCase2() {
		
		int [] arr= {1,2,1};
		int[] op = duplicateZeros(arr);
		System.out.println(Arrays.toString(op));
	}
	
public int[] duplicateZeros(int[] arr) {
	
	int j=0;
    int[] nums=new int[arr.length];
    for(int i=0; i<arr.length && j<arr.length;i++ ){
        if(arr[i]==0 && j<arr.length-1){
            nums[j]=0;
            nums[j+1]=0;
            j+=2;
        }else{
            nums[j]=arr[i];
            j++;
        }
    }
   for(int k=0; k< nums.length; k++){
       arr[k]=nums[k];
   }
	
	return nums;
        
    }

}
