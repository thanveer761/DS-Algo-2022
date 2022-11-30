package day9;

import java.util.ArrayDeque;


import org.junit.Test;

public class StudAndSandwich {
	@Test
	public void td1() {
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		int op = studAndSandwich(students, sandwiches);
		System.out.println(op);
	}
	@Test
	public void td2() {
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		int op = studAndSandwich(students, sandwiches);
		System.out.println(op);
	}

	public int studAndSandwich(int[] students, int[] sandwiches) {

		int index = 0;
		ArrayDeque < Integer > queue = new ArrayDeque<>();
		for (int i = 0; i < sandwiches.length; i++) {
			if (sandwiches[index] == students[i]) {
				index++;
			}  else {
                queue.offer(students[i]);
            }
		}
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				if (queue.peek() == sandwiches[index]) {
					queue.poll();
					index++;
				} else {
					queue.offer(queue.poll());
				}
			}
			if (queue.size() == size) break;
		}

		return queue.size();


	}
}
