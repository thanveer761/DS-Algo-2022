package day12;

import java.util.Arrays;

import org.junit.Test;

public class SortPeople {
	@Test
	public void td1() {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		String[] op = sortPeople(names, heights);
		System.out.println(Arrays.toString(op));
	}

	@Test
	public void td2() {
		String[] names = { "Alice", "Bob", "Bob" };
		int[] heights = { 155, 185, 150 };
		String[] op = sortPeople(names, heights);
		System.out.println(Arrays.toString(op));
	}

//o[N^2]
	public String[] sortPeople(String[] names, int[] heights) {
		for (int i = 0; i < heights.length; i++) {
			for (int j = i + 1; j < heights.length; j++) {

				if (heights[i] < heights[j]) {

					int temp = heights[i];
					heights[i] = heights[j];
					heights[j] = temp;

					String t1 = names[i];
					names[i] = names[j];
					names[j] = t1;
				}

			}

		}
		return names;
	}
}
