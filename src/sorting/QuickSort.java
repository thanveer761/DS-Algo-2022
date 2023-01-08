package sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class QuickSort {
	@Test
	public void test1() {
		int[] arr = { 4, 0, 2, 5, 1, -8, 7, -6 };
		int[] op = quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(op));
		// Assert.assertArrayEquals(Sorting(data), new int[] {-4,-2,0,8,11,12,13});
	}

	@Test
	public void test2() {
		int[] arr = { 4, 3, 2, 1 };
		int[] op = quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(op));
		// Assert.assertArrayEquals(inSort(data), new int[] { 1, 2, 3, 4 });
	}

	public void swap(int[] arr, int low, int pivot) {
		int tmp = arr[low];
		arr[low] = arr[pivot];
		arr[pivot] = tmp;
	}

	public int partition(int[] arr, int low, int high) {
		int p = low, j;
		for (j = low + 1; j <= high; j++)
			if (arr[j] < arr[low])
				swap(arr, ++p, j);

		swap(arr, low, p);
		return p;
	}

	public int[] quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
		return arr;
	}
}
