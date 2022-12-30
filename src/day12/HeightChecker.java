package day12;

import java.util.Arrays;

import org.junit.Test;

public class HeightChecker {
@Test
public void td1() {
	int[] heights = {1,1,4,2,1,3};
	int op = heightChecker(heights);
	System.out.println(op);
}
@Test
public void td2() {
	int[] heights = {5,1,2,3,4};
int op = heightChecker(heights);
System.out.println(op);
}

//less than o[n^2]
public int heightChecker(int[] heights) {
	 int count = 0;
     int[] arr = heights.clone();
     int n = arr.length;
     //insertion sort
     for (int i = 0; i < n; i++) {
         int p = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j] > p) {
         	arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = p;
     }   
     for(int i=0;i<arr.length;i++){
         if(heights[i] != arr[i]) {
             count++;
     }}
     return count;
}
}
