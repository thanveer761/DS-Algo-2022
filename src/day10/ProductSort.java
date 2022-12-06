package day10;

import java.util.Arrays;

public class ProductSort {
	public static void main(String[] args) {
		int arr[] = { 10,20,7,8,6};
int n = arr.length;
		int first, second, third;

		/* There should be atleast three elements */
		if (n < 3) {
			System.out.print(" Invalid Input ");
			return;
		}

		third = first = second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third)
				third = arr[i];
		}
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
System.out.println(Arrays.asList(first,second,third));
	}

}