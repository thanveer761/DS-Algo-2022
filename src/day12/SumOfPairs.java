package day12;

import java.util.Arrays;

public class SumOfPairs {

			 
	 public static void main(String[] args)
	    {
	        int arr[] = {1,2,7,6,4,2 };
	        int sum=8;
	        Arrays.sort(arr);
	 
		        int low = 0;
		        int high = arr.length - 1;
		 
		        while (low < high) {
		            if (arr[low] + arr[high] == sum) {
		                System.out.println("2 PAIR ("
		                                   + arr[low] + ", " + arr[high] + ")");
		            }
		            if (arr[low] + arr[high] > sum) {
		                high--;
		            }
		            else {
		                low++;
		            }
		        }
	
		   
		        
		    }

}